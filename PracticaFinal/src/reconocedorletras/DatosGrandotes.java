/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reconocedorletras;

/**
 *
 * @author holaalex2204
 */
public class DatosGrandotes {
    final static double [][]patrones = 
    {   
        {1,0,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,1,0,1,0,0,1,1,1,0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1,1,1,0,0,1,0,0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,1,0,1,0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,1,0,0,0,1,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,1,1,0,1,1,0,0,1,1,1,1,0,0,1,1,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,1,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,0,1,1,0,1,0,1,0,0,0,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,1,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,0,1,1,0,1,1,1,1,1,0,0,1,0,1,0,1,0,0,1,1,1,1,0,0,1,1,1,0,0,0,1,1,0,1,0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,0,0,1,0,0,0,0,1,1,0,1,1,0,1,1,0,1,0,0,0,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,0,1,1,0,1,1,0,1,0,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,1,1,1,0,1,1,0,0,0,1,0,1,1,1,0,1,0,1,0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,1,0,0,0,0,1,1,1,0,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,0,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,0,1,1,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,1,0,0,0,1,1,1,0,1,1,1,1,0,0,1,0,1,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,1,0,0,1,1,1,1,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,1,0,1,1,1,0,1,1,1,1,0,0,0,1,1,1,1,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,0,1,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,0,1,1,1,1,0,1,1,1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,1,0,0,0,0,1,0,0,1,0,1,1,1,0,0,0,1,1,0,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,1,1,0,1,0,0,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,1,0,1,0,1,1,1,0,1,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,1,0,0,1,0,1,0,1,1,1,0,0,0,0,1,1,0,1,1,1,0,1,0,0,1,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,1,1,1,0,1,1,0,1,0,0,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1},
        {1,0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0,0,1,0,1,1,1,1,1,1,0,1,0,1,1,0,1,1,0,1,1,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,1,0,0,1,0,1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,0,1,1,1,1,0,1,0,1,1,1,0,0,1,0,0,0,1,0,0,1,0,0,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,1,0,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,1,0,1,1,0,0,0,1,1,0,0,1,1,0,1,1,0,1,0,0,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,1,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,0,1,0,0,0,1,0,0,0,1,1,0,0,1,1,1,0,0,1,0,0,1,0,0,1,1,0,1,1,1,0,0,0,1,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,1,0,0,0,1,1,0,0,0,1,1,1,1,0,1,0}

        /*
        //Patrones nuevos de as gano el 1r0 y segundo     (puntuacion 2 y 1)
        {1,0,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,1,0,1,0,0,1,1,1,0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1,1,1,0,0,1,0,0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,1,0,1,0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,1,0,0,0,1,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,0,1,0,0,1,1,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,1,1,1,0,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,0,0,1,1,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,1,0,0,0,1,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0,1,0,1,1,0,0,1,1,1,1,1,1,1,0,0,1,0,0,0,1,0,0,1,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,0,0,1,1,0,0,1,1,1,0,1,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,1,0,1,0,0,0,0,1,0,0,1,1,1,1,0,0,1,1,0,0,1,0,1,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,1,1,1,0,1,1,1,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,1,0,1,0,0,0,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,0,1,0,1,0,0,0,1,0,1,1,0,1,0,1,0,1},
        {1,0,1,1,1,1,1,0,0,1,1,0,0,1,0,0,1,1,1,0,0,1,0,0,1,0,1,1,1,0,0,0,0,0,1,1,0,1,1,0,1,0,1,1,1,1,1,0,1,0,0,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,1,0,0,0,1,0,1,0,0,1,1,1,0,1,0,0,1,0,0,1,1,1,1,0,1,0,1,0,0,1,0,1,0,0,1,1,1,0,1,0,0,1,1,0,0,0,0,0,1,1,0,1,1,0,1,1,0,1,1,0,0,1,0,1,0,1,1,1,1,1,0,0,0,1,1,1,1,0,1,0,1,0,0,1,1,1,1,0,1,0,0,0,0,1,0,1,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,1,1,0,1,1,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,1,1,1,0,0,1,1,1,0,0,0,0,1,1,1,1,1,1,0,1,1,1,1,0,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,0,0,1,1,0,1,1,1,0,1,0,0,0,0,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,1,0,1,1,1,1,1,1,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,1,1,0,0,1,0,0,1,1,1,0,0,1,1,1,0,0,0,1,0,0,0,0,1,1,0,1,0,1,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,0,1,0,0,0,1,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1,0,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,1,1,1,0,1,1,0,1,1,1,1,1,0,0,1,1,0,1,0,1,0,0,1,1,1,1,0,1,1,0,0,0,1,1,1,0,0,1,1,0,1,1,1,0,0,1,0,1,1,1,0,0,1,1,1,1,0,0,1,1,0,0,1,1,1,1,1,0,1,0,0,0,0,1,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,1,0,1,0,0,1,1,0,0,0,0,1,1,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,0,1,1,0,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0,1,0,1,1,0,0,0,1,1,0,0,1,1,1,1,1,0,1,0,1,0,1,1,0,1,1,0,0,1,0,1,1,1,1,0,0,1,1,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,1,1,1,0,0,0,0,1,1,0,1,0,1,0,1,0,1,1,0,1,0,0,0,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,0,0,0,1,1,1,0,1,1,1,0,1,1,0,1,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,0,1,1,0,1,0,1,1,1,1,1,0,1,0,0,0,0,1,0,1,0,1,0,0,0,1,1,0,0,1,1,0,0,1,0,1,0,1,1,0,0,1,0,1,0,0,0,1},
        {1,0,1,1,1,1,1,0,0,1,1,0,1,0,0,0,1,0,0,1,1,1,1,0,0,1,1,0,0,1,1,1,1,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,1,1,1,0,0,1,1,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,1,1,0,0,1,1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,0,1,1,1,1,0,1,1,0,0,0,0,1,1,1,0,1,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,0,1,0,0,1,1,0,1,0,0,0,1,0,1,0,0,1,1,1,0,1,0,1,0,0,1,0,1,1,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,1,1,0,1,0,1,0,0,1,1,0,0,0,1,1,0,1,0,1,1,1,1,1,0,1,0,0,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,1,0,0,1,1,0,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0,0,1,0,0,1,1,0,1,1,1,0,1,1,1,0,1,1,0,0,0,1,1,0,0,1,0,0,0,1,0,1,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,0,0,0,1,1,0,0,1,1,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,1,1,1,0,1,1,0,1,0,0,0,0,0,1,1,0,1,1,0,1,0,1,0,0,0,1,0,1,1}
        //Patrones nuevos de es Todos estan de la patada nadie obtuvo calificacion positiva
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,1,1,0,1,1,0,0,1,1,1,1,0,0,1,1,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,1,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,0,1,1,0,1,0,1,0,0,0,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,1,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,0,1,1,0,1,1,1,1,1,0,0,1,0,1,0,1,0,0,1,1,1,1,0,0,1,1,1,0,0,0,1,1,0,1,0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,0,0,1,0,0,0,0,1,1,0,1,1,0,1,1,0,1,0,0,0,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,1,0,1,1,1,1,0,1,0,0,0,1,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,0,1,1,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,1,1,1,0,1,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,1,0,0,1,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,0,1,1,1,0,1,0,1,0,0,1,1,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,0,0,1,1,1,1,0,0,0,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,0,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,1,0,1,1,0,1,1,1,0,1,1,1,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,1,0,0,1,1,1,1,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,0,1,1,0,1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,1,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,1,1,1,0,0,1,0,1,0,1,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,0,0,1,1,0,1,0,1,0,1,1,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,0,0,1,1,1,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,1,1,1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1,0,0,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,1,0,1,1,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,1,0,0,1,1,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,1,1,0,0,1,1,0,0,1,1,0,1,0,1,0,1,1,0,0,1,1,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0,0,1,1,1,1,1,0,1,0,1,1,0,0,1,1,1,0,0,1,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,1,0,1,0,1,0,0,1,1,1,0,1,1,0,0,1,1,0,0,1,1,1,0,0,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,0,1,0,0,1,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,1,0,1,1,0,0,1,0,1,0,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,1,0,1,0,0,1,1,1,1,0,1,0,1,0,0,1,1,1,1,0,0,1,1,1,0,0,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,1,1,0,1,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,1,0,0,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,0,1,1,1,0,1,1,1,1,1,1,0,0,1,0,0,1,1,0,0,1,1,0,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,0,0,1,0,1,1,1,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,1,1,0,0,0,1,1,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,1,0,1,0,1,0,0,1,1,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,1,0,1,0,0,1,0,1,1,0,1,0,1,0,1,1,0,1,0,0,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,0,1,1,0,1,0,0,0,1,1,0,1,0,1,0,0,0,1,1,0,0,0,1,1,1,1,0,1,1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,1,1,0,1,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,0,0,1,1,0,0,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,1,0,0,0,0,1,1,1,1,0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,0,0,0,1,1,1,0,1,1,1,0,0,1,0,0,0,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,0,0,1,1,1,0,1,0,1,1,0,1,0,1,1,1,0,1,1,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,0,0,0,1,1,0,0,0}
        
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,1,1,1,0,0,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,1,1,0,1,1,0,1,1,1,0,0,1,1,1,1,1,0,1,1,0,0,1,0,0,1,1,1,1,0,1,1,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,1,1,1,1,1,1,1,0,1,0,0,0,0,1,1,0,1,1,1,0,0,0,0,1,1,1,1,0,0,1,1,1,1,0,1,0,1,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,1,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,0,0,1,0,0,1,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,1,0,1,1,0,0,0,1,1,1,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,0,1,1,0,1,0,0,1,1,1,0,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,1,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1},
        
        //i's
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,0,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,1,1,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,1,1,0,0,1,1,1,1,1,0,1,0,0,0,0,1,0,1,0,1,1,0,0,0,1,1,1,1,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,0,0,1,1,0,1,1,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,0,1,1,1,0,0,0,1,1,0,0,1,0,0,0,1,0,0,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,0,1,0,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,1,1,0,1,0,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,1,1,0,0,0,0,1,0,0,1,0,0,0,1,1,1,0,0,1,0,1,0,0,1,0,1,0,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,1,1,0,0,0,0,1,0,1,1,1,0,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,0,0,0,0,1,1,1,0,1,1,1,1,0,0,1,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,1,0,0,0,0,1,1,1,1,0,0,0,1},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,1,1,0,0,1,1,0,0,0,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,1,0,0,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,0,1,1,1,1,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,1,1,1,0,0,0,0,0,1,1,1,0,1,1,1,1,0,1,0,0,1,1,1,1,0,1,0,0,0,1,0,1,1,0,1,1,1,1,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,1,0,1,1,0,0,0,1,1,1,0,1,0,1,1,0,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,0,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,0,0,0,1,0,1,0,1,0,1,1,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,0,0,0,1,0,1,1,1,0,1,1,1,0,0,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,0,1,0,0,1,1,0,1,1,1,1,0,0,0,1,1,1,0,1,1,0,0,1,1,1,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,0,0,1,1,0,1,0,1,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,0,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,1},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,0,1,1,0,1,1,0,1,0,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,1,1,1,0,1,1,0,0,0,1,0,1,1,1,0,1,0,1,0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,1,0,0,0,0,1,1,1,0,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,0,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,0,1,1,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,1,0,0,0,1,1,1,0,1,1,1,1,0,0,1,0,1,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,1,0,0,1,1,1,1,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,1,1,1,0,0,1,0,0,0,1,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,0,0,0,1,1,1,0,1,0,0,0,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,1,1,0,1,0,1,1,1,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,1,0,0,1,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,0,0,1,1,1,0,0,1,1,1,1,0,1,0,1,1,1,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,1,1,0,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,1,1,1,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,1,1,0,0,1,1,1,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0,0,0,1,1,1,1,0,0,0,1,1,1,1,0,0,0,1,0,1,1,1,1,0,1,1,0,1,0,0,0,1,1,0,1,0,1,0,0,1,1,1,0,1,0,1,1,1,0,1,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,0,1,1,0,0,0,0,1,1,1,0,0,1,1,0,0,1,1,1,1,1,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,1,0,1,1,1,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,1,1,1,0,0,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,1,1,0,0,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,1,0,0,1,0,1,1,1,1,0,1,0,0,0,1,0,0,1,1,1,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,1,0,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,1,1,1,0,0,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,1,0,1,1,0,0,1,0,1,0,0,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,0,0,0,1,1,1,1,1,0,1,1,0,0,1,1,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0,1,1,0,0,1,1,0,1,1,1,1,0,0,1,1,1,0,1,0,1,1,0,1,0,0,1,1,0,0,0,0,1,0,0,0,1,1,0,0,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,1,0,1,1,0,1,1,0,0,0,1,1,0,1}

        //nuevas letras  us Tambien estan de la patada =(
        {1,0,1,1,1,1,1,0,0,1,1,0,1,1,0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,1,1,0,0,1,1,0,1,0,0,1,1,1,0,1,0,1,1,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,0,1,1,0,1,1,0,0,0,0,1,1,0,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,1,1,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,0,1,1,1,0,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,1,0,1,1,1,1,0,1,0,0,1,0,0,0,0,1,1,1,1,0,1,0,1,1,0,0,0,0,1,1,0,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,0,1,1,1,0,0,0,1,1,1,0,1,0,0,1,0,1,0,1,0,0,1,1,0,1,1,1,0,1,0,1,1,0,0,1,1,1,1,0,1,0,0,1,0,1,0,1,1,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,1,1,0,0,1,1,1,1,0,1,0,0,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,1,0,0,1,1,1,0,1,0,1,0,1,0,0,0,0,1,1,0,1,0,1,1,0,0,1,0,1,1,1,0,0,1,1,0,1,1,0,0,1,1,1,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,1,0,0,0,0,1,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0,0,1,0,1,1,1,1,1,1,0,1,0,1,1,0,1,1,0,1,1,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,1,0,0,1,0,1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,0,1,1,1,1,0,1,0,1,1,1,0,0,1,0,0,0,1,0,0,1,0,0,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,1,0,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,1,0,1,1,0,0,0,1,1,0,0,1,1,0,1,1,0,1,0,0,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,1,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,0,1,0,0,0,1,0,0,0,1,1,0,0,1,1,1,0,0,1,0,0,1,0,0,1,1,0,1,1,1,0,0,0,1,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,1,0,0,0,1,1,0,0,0,1,1,1,1,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0,1,1,1,0,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,0,1,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,0,1,0,0,1,1,0,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,0,1,1,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,0,1,0,1,0,1,1,1,0,0,1,1,1,0,1,0,1,1,1,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,1,0,0,1,0,0,1,1,1,1,0,0,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,1,0,1,0,0,0,0,0,1,0,1,1,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,0,0,1,0,1,0,1,1,0,1,0,0,1,1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1,1,0,0,1,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1,1,1,0,0,0,1,1,0,1,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,1,1,0,0,1},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,0,1,1,1,0,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,0,0,0,1,1,1,1,0,1,1,0,1,1,0,1,0,0,1,0,1,1,1,0,0,1,1,1,1,0,1,0,1,1,1,0,1,0,0,0,1,0,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,0,0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,1,0,0,1,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,0,0,1,0,0,0,1,1,0,1,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,0,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,0,1,0,1,1,0,0,1,0,0,0,0,1,1,1,0,1,0,1,1,1,0,0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,0,1,0,0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,1,1,0,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,1,0,0,1,1,1,0,1,1,1,1,1,1,0,0,1,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,1,1,1,0,0,1,1,0,0,1,0,1,1,0,1,1,1,1,1,0,0,1,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,0,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,0,1,0,1,0,0,1,1,1,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,1,0,1,1,0,0,0,0,0,1,0,0,1,1,1,0,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,0,0,0,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,0,0,1,1,0,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1,1,0,1,0,0,1,0,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,0,1,1,0,0,0,0,0,1,1,1,0,0,1,1,1,0,0,1,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,0,1,0,0,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,1,0,1,1,1,0,0,0,0,0,1,0,0}
        */
        /*
        //nuevas letras os 
        {1,0,1,1,1,1,1,0,0,1,1,0,1,0,0,0,0,1,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,1,1,0,0,0,0,1,1,0,0,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0,1,1,1,1,0,0,0,1,0,1,1,1,0,1,1,0,1,0,0,1,1,1,1,0,1,0,0,1,1,0,1,1,1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,0,0,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,0,1,0,1,0,0,1,1,1,1,0,1,0,0,0,0,1,0,0,1,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,1,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,1,0,0,1,1,1,0,1,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,1,0,1,0,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,1,1,1,0,0,0,1,1,0,1,0,1,1,1,0,1,1,0,1,0,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,1,0,1,0,1,0,0,1,1,1,0,1,0,1,0,0,1,0,0,1,1,0,1,0,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,0,0,0,0,0,1,1,1,0,1,0,0,0,1,1,1,0,0,1,0},
        {1,0,1,1,1,1,1,0,0,1,1,0,1,0,0,0,0,1,1,0,1,1,1,1,1,1,0,0,0,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,1,1,1,0,1,1,0,1,0,0,0,1,0,0,1,0,0,1,0,1,1,0,0,1,1,1,1,0,1,0,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,1,1,0,0,1,1,1,0,1,0,1,1,1,0,1,1,0,0,1,1,0,0,1,0,0,1,0,1,1,1,1,1,1,0,1,0,1,1,1,0,0,0,1,1,1,1,0,0,1,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,0,0,1,0,1,0,0,1,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,0,1,1,1,0,0,0,1,1,1,0,1,1,0,0,1,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,0,1,0,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,0,1,0,0,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,0,1,1,0,1,1,0,1,1,1,0,1,1,1,0,0,0,1,0,1,0,1,1,1,0,1,1,0,0,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,1,0,1,1,1,0,1,1,1,1,0,0,0,1,1,1,1,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,0,1,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,0,1,1,1,1,0,1,1,1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,1,0,0,0,0,1,0,0,1,0,1,1,1,0,0,0,1,1,0,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,1,1,0,1,0,0,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,1,0,1,0,1,1,1,0,1,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,1,0,0,1,0,1,0,1,1,1,0,0,0,0,1,1,0,1,1,1,0,1,0,0,1,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,1,1,1,0,1,1,0,1,0,0,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,1,0,1,1,0,1,0,1,1,1,1,0,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,1,1,0,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,0,1,1,0,0,1,1,1,0,1,0,1,0,0,1,1,0,1,1,0,1,1,1,0,0,1,0,1,0,1,0,0,0,1,1,1,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0,0,0,0,1,1,0,1,1,0,1,1,1,0,0,0,0,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,1,0,0,1,1,1,0,1,0,0,1,0,1,0,0,0,0,1,1,1,0,1,0,0,1,0,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,1,1,0,1,0,0,0,1,1,0,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,1,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,1,0,1,1,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,1,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,0,1,1,0,1,0,0,1,1,1,1,0,0,0,1,0,1,1,0,0,0,1,0,1,0,1,1,0,0,0,1,1,1,0,0,0,1,1,0,1,0,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,0,0,1,0,0,1,0,0,1,1,1,0,0,1,1,0,0,1,1,0,1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,1,1,0,0,0,1,1,1,1,0,1,0,0,1,1,0,1,1,1,1,1,0,0,1,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,1,0,1,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,0,0,1,1,1,1,0,1,1,1,0,0,1,0,1,1,1,1,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1,1,1,0,1,0,1,1,0,0,0,1,0,1,0,0,1,0,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,0,0,0,0,0,1},
        


        {1,0,1,1,1,1,1,0,0,1,1,0,1,0,0,1,1,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,1,1,1,0,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,0,0,1,1,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,1,0,0,0,1,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0,1,0,1,1,0,0,1,1,1,1,1,1,1,0,0,1,0,0,0,1,0,0,1,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,0,0,1,1,0,0,1,1,1,0,1,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,1,0,1,0,0,0,0,1,0,0,1,1,1,1,0,0,1,1,0,0,1,0,1,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,1,1,1,0,1,1,1,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,1,0,1,0,0,0,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,0,1,0,1,0,0,0,1,0,1,1,0,1,0,1,0,1},
        //patron malo
        
        
            //Letras de la e
        {1,0,1,1,1,1,1,0,0,1,1,0,0,1,0,1,0,1,1,1,1,0,1,0,0,0,1,1,1,0,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,1,0,1,0,0,1,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1,0,0,1,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1,0,0,1,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,1,0,1,0,1,1,0,0,1,1,0,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,0,0,0,1,1,1,0,0,0,1,1,0,1,1,0,1,0,0,1,1,0,1,1,1,0,1,0,1,0,0,1,0,0,1,0,0,0,1,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,1,0,1,1,0,1,0,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,1,1,1,1,1,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,1,1,0,1,0,1,0,1,0,0,1,0},
        // 68{1,0,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,1,0,0,0,0,0,1,1,1,0,1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,1,0,1,1,1,0,0,1,1,1,1,0,1,0,1,0,0,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,0,1,1,0,0,1,1,1,0,1,0,0,0,1,1,0,0,1,1,0,1,0,1,0,1,1,1,1,1,0,1,1,0,0,0,1,1,0,0,1,1,1,1,0,1,0,1,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,1,0,1,0,1,1,1,0,1,0,0,1,0,0,1,1,0,0,1,1,0,1,1,0,1,0,1,0,1,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,0,1,1,0,1,0,1,1,1,0,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,0,1,1,1,0,1,1,0,0,0,1,0,0,0,0,1,0,0,0,1,1,1,1,0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,1,0,1,1,0,1,1,1,0,1,0,0,1,1,1,1,0,1,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,1,1,0,1,0,1,1,1,0,1,1,1,1,0,0,0},    
        //letra i
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,1,0,1,0,1,1,0,1,0,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,0,1,0,1,1,1,1,0,1,1,1,0,0,1,1,0,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1,1,1,1,1,1,0,1,0,0,1,1,1,0,1,0,1,1,1,1,1,0,0,0,1,1,1,1,0,0,1,1,1,1,0,0,1,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0,1,0,0,1,0,1,1,1,1,0,1,1,0,0,0,0,1,1,1,0,1,1,1,1,0,0,0,1,1,0,0,0,0,1,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,1,1,0,0,1,1,1,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,1,1,0,0,1,1,1,0,1,1,1,0,0,0,0,0,1,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,0,1,1,0,1,1,0,0,0,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,1,1,0,1,1,0,1,0,1,1,1,1,1,1,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1,1,1,0,0,0,0,1,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,0,1,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,0,1,0,0},
        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,1,0,0,1,0,0,1,1,0,0,1,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,1,0,0,0,0,1,1,0,1,1,1,1,1,0,1,0,0,0,1,1,1,1,0,1,0,0,1,1,1,1,0,1,0,0,1,1,1,1,1,1,0,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,1,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,1,1,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,0,1,1,1,1,1,0,0,1,0,1,0,1,0,0,1,1,1,1,1,1,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0,1,0,1,0,1,1,0,1,0,1,1,1,0,1,1,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,0,1,1,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,1,1,1,1,1,1,0,1,1,0,1,1,0,1,0,1,1,0,0,0,1,1,1,1,1,0,1,1,1,0,0,0,0,0,0,1,1,1,0,0,0,1,1,0,1},

        {1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,1,1,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,1,1,0,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,0,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,0,0,0,1,0,1,1,0,1,0,1,0,1,1,1,1,0,0,0,1,0,1,1,1,1,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,1,0,0,1,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,1,1,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,0,0,0,1,1,1,1,1,0,0,1,0,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,1,0,0,1,1,0,1,0,1,0,0,1,1,0,1,1,1,1,0,1,0,0,1,1,1,1,1,1,0,0,1,1,0,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,0,0,1,0,1,1,1,0,1,1,0,1,1,0,0,1,0,0,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,0,0,0,1,0,1,1,0,1,0,0,1,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1,1,0,0,0,1,0,0,1,1,1,1,0,0,0,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,0,1,1,0,1,0,1,0,0,1,1,0,1,1,1,0,1,0,1,0,0,1,0,0,0}*/
    };
    public static double[][] getGrid()
    {
    	return patrones;
    }
    public static double[][] getIdeal()
    {
        int codigos[] = new int[5];
        double[][] res = new double[codigos.length][7];
        double[] temp;
        int pos = 0;        
        res[0] = ReconocedorLetras.getBinaryNumber(65);
        res[1] = ReconocedorLetras.getBinaryNumber(66);
        //res[2] = ReconocedorLetras.getBinaryNumber(68);
        res[2] = ReconocedorLetras.getBinaryNumber(67);
        res[3] = ReconocedorLetras.getBinaryNumber(68);
        res[4] = ReconocedorLetras.getBinaryNumber(69);
        return res;
    }
}
