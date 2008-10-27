/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores;

/**
 *
 * @author stafoxter
 */
public class Util {

      /**
     * valida si es cadena vacia
     * @param cadena es la cadena a comprobar
     * @return
     */       
    public boolean esCadenaVacia(String cadena)
    {
       boolean resultado =false;
    
       if(!cadena.isEmpty()){
       resultado=true;
       }
       
       return resultado;
    }
    
    
    /**
     * 
     * @param numero alcual 
     * @return
     */
    public boolean esNumeroNegativo(double numero)
    {
        boolean resultado = false;
        
        if(numero<0) resultado= true;
            
        return resultado;
    }
  
    /**
    * metodo que sirve par saber si el codigo ingresado es valido, comprueba 
     * si la longitud del codigo, en el nivel correspondiente, es valida
     * @param codigo
     * @return
     */
    public boolean esCodigoValido(String codigo)
    {
       boolean resultado = false;
      String cc= new String();
       char nivel =codigo.charAt(0);
       int ultimaHoja=0; 
       
       if(codigo.length()>0)
       {
        switch(nivel)
        {
            //para el caso en q el nivel sea el cero
            case 0:
               //veo la posicion de la ultima hoja
                ultimaHoja= codigo.indexOf(7);
               
               if(ultimaHoja==8)
               {
                   if(codigo.length()==10)
                   {
                       resultado=true;
                   }
               }
               else if(ultimaHoja>=3 && ultimaHoja<=7)
               {
                if(codigo.length()==8)
                   {
                       resultado=true;
                   }
               }
             break;
             
             
             
             case 1:
             
//                 cc = codigo.substring(1,2);
//                ultimaHoja = Integer.parseInt(cc);
//                
//                if(ultimaHoja>=0&&ultimaHoja<10)
//                {
//                    String temp =new String();
//                    int capa =0;
//                if(ultimaHoja==1)
//                {
//                 temp = codigo.substring(3,4);
//                 capa = Integer.parseInt(temp);
//                   if(capa>0&&capa<14)
//                   {
//                       if(capa==8||capa==9||capa==10||capa==11)
//                       {
//                        if (codigo.length()==5)
//                        {
//                            resultado=true;
//                        }
//                       }
//                       else
//                       {
//                       if (codigo.length()==8)
//                        {
//                            resultado=true;
//                        }
//                       }
//                   }
//                }
//                else if (ultimaHoja ==2)
//                {
//                    temp= codigo.substring(3, 4);
//                    capa = Integer.parseInt(temp);
//                    if(capa==2||capa==8)
//                     {
//                       String t= codigo.substring(7);
//                       int c = Integer.parseInt(t);
//                         
//                            if(c>0&&c<3)
//                            {
//                              if(codigo.length()==8)
//                              {
//                               resultado=true;
//                              }
//                            }
//                    }
//                    else
//                    {
//                    if(codigo.length()==5)
//                    {
//                       resultado=true;
//                    }
//                    }
//                }
//                else if (ultimaHoja==3)
//                {
//                    
//                }
//                    
//                    
////                 if (codigo.length()==5)
////                 {
////                   resultado=true;
////                 }
////                 }
////                       else
////                       {
////                       if (codigo.length()==8)
////                        {
////                            resultado=true;
////                        }
////                       }
////                    
////                    
////                }
//                   
//                   
//                   
//                   
//                   
//                   
//                   
//                
//                }
//                
//                 
//               
//               
//               break;
//            
             case 2:
                //obtengo y asigno el numero de hoja
                cc = codigo.substring(3,4);
                 ultimaHoja = Integer.parseInt(cc);
                 
                 if(ultimaHoja>0&&ultimaHoja<12)
                 {
                   resultado=true;
                 }
                     
             break;
           
            case 3:
            cc = codigo.substring(1,2);
            ultimaHoja = Integer.parseInt(cc);
                
                   if(ultimaHoja>=0&&ultimaHoja<7)
                   {
                    if(ultimaHoja==2)
                    {
                    if(codigo.length()==3)
                    {
                        resultado=true;
                    }    
                    }
                    else
                    {
                    if(codigo.length()==5)
                    {
                       resultado=true; 
                    }   
                    }
                   } 
           break;    
           case 4:
            //nivel 4
            cc = codigo.substring(1,2);
            ultimaHoja = Integer.parseInt(cc);
                
             if(ultimaHoja>=0&&ultimaHoja<5)
             {
               if(ultimaHoja==4)
               {
               if(codigo.length()==3)
               {
                resultado=true;
               }    
               }
               else
               {
                if(codigo.length()==5)
                {
                resultado=true;
                }
               }
             }    
            
           break;
           case 5:
            //nivel 5
            cc = codigo.substring(1,2);
            ultimaHoja = Integer.parseInt(cc);
                
             if(ultimaHoja>=0&&ultimaHoja<18)
             {
               if(codigo.length()==3)
               {
                resultado=true;
               }    
             }
               
           break;
           case 6:
               
           //nivel 6
               
           cc = codigo.substring(1,2);
            ultimaHoja = Integer.parseInt(cc);
                
             if(ultimaHoja>=0&&ultimaHoja<10)
             {
               if(ultimaHoja==3||ultimaHoja==6)
               {
               if(codigo.length()==5)
               {
                resultado=true;
               }    
               }
               else
               {
                if(codigo.length()==3)
                {
                resultado=true;
                }
               }
             }
           break;
           case 7:
             //nivel 7
            cc = codigo.substring(3,4);
            ultimaHoja = Integer.parseInt(cc);
                
             if(ultimaHoja>=0&&ultimaHoja<8)
             {
               if(codigo.length()==5)
               {
                resultado=true;
               }    
            }
            break;
           
            default:
           //nivel 8
            if(codigo.length()==3)
                {
                resultado=true;
                }                    
           break;
           
       }
           
       }
       
       
        
     return resultado;
    }
    
     
            
    
}
