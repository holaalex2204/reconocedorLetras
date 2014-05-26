package practicafinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class XorExample extends JFrame implements
ActionListener,Runnable {

  protected JButton btnTrain;
  protected JButton btnRun;
  protected JButton btnQuit;
  protected JLabel status;
  protected Thread worker = null;
  protected final static int NUM_INPUT = 2;
  protected final static int NUM_OUTPUT = 1;
  protected final static int NUM_HIDDEN = 3;
  protected final static double RATE = 0.5;
  protected final static double MOMENTUM = 0.7;
  protected JTextField data[][] = new JTextField[4][4];
  protected Network network;

  /**
   * Constructor. Setup the components.
   */
  public XorExample()
  {
    setTitle("XOR Solution");
    network = new Network(
                         NUM_INPUT,
                         NUM_HIDDEN,
                         NUM_OUTPUT,
                         RATE,
                         MOMENTUM);

    Container content = getContentPane();

    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    content.setLayout(gridbag);

    c.fill = GridBagConstraints.NONE;
    c.weightx = 1.0;

    // Training input label
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    c.anchor = GridBagConstraints.NORTHWEST;
    content.add(
               new JLabel(
                         "Enter training data:"),c);

    JPanel grid = new JPanel();
    grid.setLayout(new GridLayout(5,4));
    grid.add(new JLabel("IN1"));
    grid.add(new JLabel("IN2"));
    grid.add(new JLabel("Expected OUT   "));
    grid.add(new JLabel("Actual OUT"));

    for ( int i=0;i<4;i++ ) {
      int x = (i&1);
      int y = (i&2)>>1;
      grid.add(data[i][0] = new JTextField(""+y));
      grid.add(data[i][1] = new JTextField(""+x));
      grid.add(data[i][2] = new JTextField(""+(x^y)));
      grid.add(data[i][3] = new JTextField("??"));
      data[i][0].setEditable(false);
      data[i][1].setEditable(false);
      data[i][3].setEditable(false);
    }

    content.add(grid,c);

    // the button panel
    JPanel buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.add(btnTrain = new JButton("Train"));
    buttonPanel.add(btnRun = new JButton("Run"));
    buttonPanel.add(btnQuit = new JButton("Quit"));
    btnTrain.addActionListener(this);
    btnRun.addActionListener(this);
    btnQuit.addActionListener(this);

    // Add the button panel
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    c.anchor = GridBagConstraints.CENTER;
    content.add(buttonPanel,c);

    // Training input label
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    c.anchor = GridBagConstraints.NORTHWEST;
    content.add(
               status = new JLabel("Click train to begin training..."),c);

    // adjust size and position
    pack();
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension d = toolkit.getScreenSize();
    setLocation(
               (int)(d.width-this.getSize().getWidth())/2,
               (int)(d.height-this.getSize().getHeight())/2 );
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);

    btnRun.setEnabled(false);
  }

  /**
   * The main function, just display the JFrame.
   *
   * @param args No arguments are used.
   */
  public static void main(String args[])
  {
    (new XorExample()).setVisible(true);
  }

  /**
   * Called when the user clicks one of the three
   * buttons.
   *
   * @param e The event.
   */
  public void actionPerformed(ActionEvent e)
  {
    if ( e.getSource()==btnQuit )
      System.exit(0);
    else if ( e.getSource()==btnTrain )
      train();
    else if ( e.getSource()==btnRun )
      evaluate();
  }

  /**
   * Called when the user clicks the run button.
   */
  protected void evaluate()
  {
    double xorData[][] = getGrid();
    int update=0;

    for (int i=0;i<4;i++) {
      NumberFormat nf = NumberFormat.getInstance();
      double d[] = network.computeOutputs(xorData[i]);
      data[i][3].setText(nf.format(d[0]));
    }

  }


  /**
  * Called when the user clicks the train button.
  */
  protected void train()
  {
    if ( worker != null )
      worker = null;
    worker = new Thread(this);
    worker.setPriority(Thread.MIN_PRIORITY);
    worker.start();
  }

  /**
  * The thread worker, used for training
  */
  public void run()
  {
    double xorData[][] = getGrid();
    double xorIdeal[][] = getIdeal();
    int update=0;

    int max = 10000;
    for (int i=0;i<max;i++) {
      for (int j=0;j<xorData.length;j++) {
        network.computeOutputs(xorData[j]);
        network.calcError(xorIdeal[j]);
        network.learn();
      }

      update++;
      if (update==100) {
        status.setText( "Cycles Left:" + (max-i) + ",Error:" + network.getError(xorData.length) );
        update=0;
      }
    }
    btnRun.setEnabled(true);
  }


  /**
   * Called to generate an array of doubles based on
   * the training data that the user has entered.
   *
   * @return An array of doubles
   */
  double [][]getGrid()
  {
    double array[][] = new double[4][2];

    for ( int i=0;i<4;i++ ) {
      array[i][0] =
      Float.parseFloat(data[i][0].getText());
      array[i][1] =
      Float.parseFloat(data[i][1].getText());
    }

    return array;
  }

  /**
   * Called to set the ideal values that that the neural network
   * should return for each of the grid training values.
   *
   * @return The ideal results.
   */
  double [][]getIdeal()
  {
    double array[][] = new double[4][1];

    for ( int i=0;i<4;i++ ) {
      array[i][0] =
      Float.parseFloat(data[i][2].getText());
    }
    return array;
  }
}