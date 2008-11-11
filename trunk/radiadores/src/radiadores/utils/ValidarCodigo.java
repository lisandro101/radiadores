/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.utils;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

/**
 * clase destinada a la validacion del codigo de la empresa
 * @author Dante
 */

/**
 * Lo unico que no he podido hacer, q es halla distintos tamaños de
 * PATRON_CODIGO, es decir, q comprube que la dimension del codigo puede ser
 * "0-01-01-005-01" , como "1-01-01-047", como "1-01-10".
 */


public class ValidarCodigo extends InputVerifier {

    private static final String PATRON_CODIGO = "(\\d-)?(\\d)(\\d-)?[(\\d)(\\d-)]?[(\\d)(\\d)(\\d-)]?[(\\d)(\\d)]";
               
    @Override
    public boolean verify(JComponent componente) {
        
         boolean resultado = false;
        
        if(componente instanceof JTextComponent) {
            JTextComponent campoDeTexto = (JTextComponent)componente;
           
            resultado = this.esCodigo(campoDeTexto.getText());
        }
        
        return resultado;
    }

 
    private boolean esCodigo(String cadena) {
       
        boolean cc = esCodigoValido(cadena);
        
         System.out.println("el resultado del analisis  : " + (cadena!=null && cadena.matches(PATRON_CODIGO)&&cc));
        
        return cadena != null && cadena.matches(PATRON_CODIGO)&&!cc;
    }

      private boolean esCodigoValido(String codigo) {
        boolean resultado = false;
        
        String co = new String();
        
        
        if (codigo!=null)
        {
        
            for (int x=0; x < codigo.length(); x++) {
        if (codigo.charAt(x) != '-')
        {
           co+= String.valueOf(codigo.charAt(x));
         }
        }
        String cc = new String();
        codigo=co;
        char nivel = codigo.charAt(0);
        int ultimaHoja = 0;
        
        if (codigo.length() > 0) {
            switch (nivel) {
                //para el caso en q el nivel sea el cero
                case '0':
             
               if (codigo.length()>5 && codigo.length()<11){
                    //veo la posicion de la ultima hoja
                    String ultima= String.valueOf(codigo.charAt(7));
                     ultimaHoja = Integer.parseInt(ultima);
                    
                     if (ultimaHoja == 8) {
                        if (codigo.length() == 10) {
                            resultado = true;
                        }
                    } else if (ultimaHoja >= 1 && ultimaHoja <= 7) {
                        if (codigo.length() == 8) {
                            resultado = true;
                        }
                    }
                     
            } 
                    break;

                case '1':
                    
                 if (codigo.length()>4 && codigo.length()<11){
                    cc = codigo.substring(2,3);
                    ultimaHoja = Integer.parseInt(cc);
                    //aca ya sabemos el 2 nivel
                    //tengo q empezar a averiguar por el 3 nivel
                    if(ultimaHoja>0&&ultimaHoja<10)
                    {
                     if(ultimaHoja==1)
                     {
                       int temp = Integer.parseInt(codigo.substring(4,5));
                       //estoy en el 3 nivel
                       if((temp==1 ||temp==2)&&(codigo.length()==8))
                       {
                       int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux==47||aux==60||aux==73||aux==55||aux==80||aux==105||aux==42||aux==56||aux==70)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }  
                           
                       }
                       else if ((temp==3||temp==4)&&(codigo.length()==8))
                       {
                       int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux==50||aux==55)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }     
                       }
                       else if((temp ==5)&&(codigo.length()==8))
                       {
                       int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux==200||aux==300||aux==100||aux==75)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }     
                       }
                       else if((temp ==6)&&(codigo.length()==8))
                       {
                       int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux==60||aux==125)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }     
                       }
                       else if(temp ==7)
                       {
                       int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux==100||aux==200)
                         {
                            int lo = codigo.length();
                             if (lo==8)
                            {
                            resultado=true;
                            }
                         }     
                       }
                       else if(temp ==8||temp ==9||temp ==10||temp ==11||temp ==13)
                       {
                       if (codigo.length()==5)
                            {
                            resultado=true;
                            }     
                       }
                       else if(temp==12)
                       {
                       int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux==001||aux==002)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }
                       }
                       
                       
                     }
                     else if (ultimaHoja==2)
                     {
                        int temp = Integer.parseInt(codigo.substring(4,5));
                        
                        if(temp>0&&temp<9)
                        {
                        if(temp==1||temp==3||temp==4||temp==5||temp==6||temp==7)
                        {
                         if(codigo.length()==5)
                         {
                            resultado=true;
                         }
                        }
                        else if((temp==2 || temp == 8)&&(codigo.length()==8))
                        {
                         int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux==001||aux==002)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }
                        }
                            
                        
                        }
                     }
                     else if(ultimaHoja==3)
                     {
                        int temp = Integer.parseInt(codigo.substring(4,5));
                     if((temp>0&&temp<4)&&(codigo.length()==8))
                     {
                        int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux>0&&aux<004)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }
                     }
                     }
                     else if(ultimaHoja==4)
                     {
                        int temp = Integer.parseInt(codigo.substring(4,5));
                        if(temp>0&&temp<3)
                        {
                         if (codigo.length()==5)
                            {
                            resultado=true;
                            }
                        }
                     }
                     else if(ultimaHoja==6)
                     {
                        int temp = Integer.parseInt(codigo.substring(4,5));
                        if((temp==1||temp==2)&&(codigo.length()==8))
                        {
                        int aux = Integer.parseInt(codigo.substring(5,8));
                         if(aux>0&&aux<12)
                         {
                            if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }
                        
                        }
                     }
                     else if(ultimaHoja==7)
                     {
                        int temp = Integer.parseInt(codigo.substring(4,5));
                        if((temp==1||temp==2) && (codigo.length()==8))
                        {
                        int auxz = Integer.parseInt(codigo.substring(5,8));
                         
                        if(auxz>0 && auxz<12)
                         {
                          
                             
                             if (codigo.length()==8)
                            {
                            resultado=true;
                            }
                         }
                        }
                     }
                     
                     else if(ultimaHoja==8)
                     {
                     int temp = Integer.parseInt(codigo.substring(3,5));
                     if(temp>0&&temp<12)
                     {
                        if (codigo.length()==5)
                        {
                            resultado=true;
                        }
                     }
                     }
                     else if (ultimaHoja==9)
                     {
                        int temp = Integer.parseInt(codigo.substring(3,5));
                        if(temp>0&&temp<4)
                     {
                        if (codigo.length()==5)
                        {
                            resultado=true;
                        }
                     }
                        
                     }
                    }
                 }
                    break;
                    case '2':
                    if (codigo.length()==5){

                    
                    ultimaHoja = Integer.parseInt(codigo.substring(3, 5));
//
                    if (ultimaHoja > 0 && ultimaHoja < 12) {
                        resultado = true;
                    }
                    }
                    break;

                case '3':
                    if (codigo.length()>2 && codigo.length()<6)
                    {
                    cc = codigo.substring(1, 3);
                    ultimaHoja = Integer.parseInt(cc);
                    if (ultimaHoja > 0 && ultimaHoja < 7) {
                        if (ultimaHoja == 2) {
                            if (codigo.length() == 3) {
                                resultado = true;
                            }
                        } else if( ultimaHoja!=2 && (ultimaHoja>0&&ultimaHoja<6)&&(codigo.length()==5))
                        {
              
                            int aux = Integer.parseInt(codigo.substring(3,5));
                           if (ultimaHoja==1)
                           {
                            if ((aux>0&&aux<4)&&(codigo.length()==5)) resultado = true;
                           }
                           else if (ultimaHoja==3)
                           {
                            if ((aux>0&&aux<5)&&(codigo.length()==5))resultado = true;
                           }
                           else if (ultimaHoja==4)
                           {
                            if ((aux>0&&aux<11)&&(codigo.length()==5)) resultado = true;
                           }
                           else if (ultimaHoja==5)
                           {
                            if ((aux>0&&aux<8)&&(codigo.length()==5))
                                resultado = true;
                           } 
                        }
                    }
                  }
                    break;
                case '4':
//                    //nivel 4
                 if (codigo.length()>2 && codigo.length()<6){ 
                  cc = codigo.substring(1, 3);
                  ultimaHoja = Integer.parseInt(cc);

                    if (ultimaHoja > 0 && ultimaHoja < 5) {
                        if (ultimaHoja == 4) 
                        {
                            if (codigo.length() == 3) {
                                resultado = true;
                            }
                        } 
                        else if (codigo.length()==5)
                        {
                           int temp = Integer.parseInt(codigo.substring(4));
                           
                           if (codigo.length() == 5 &&(temp>0&&temp<6)) 
                           {
                                resultado = true;
                           }
                        }
                    }
                    }
                    break;
                case '5':
             
              if (codigo.length()>2 && codigo.length()<4){
                    //nivel 5
                    cc = codigo.substring(1, 3);
                    ultimaHoja = Integer.parseInt(cc);

                    if (ultimaHoja > 0 && ultimaHoja < 18) {
                        if (codigo.length() == 3) {
                            resultado = true;
                        }
                    }
            }
                    break;
                case '6':

                    //nivel 6

                    if (codigo.length()>2 && codigo.length()<6){
                    cc = codigo.substring(2,3);
                    ultimaHoja = Integer.parseInt(cc);

                    if (ultimaHoja > 0 && ultimaHoja < 10)
                    {
                        if (ultimaHoja == 3&&codigo.length()>4)
                        {
                         int temp = Integer.parseInt(codigo.substring(3,5));
                            if(temp>0&&temp<4)
                            {
                                if(codigo.length()==5){resultado=true;}
                            }
                        }
                        else if (ultimaHoja==6 && codigo.length()>4)
                        {
                            
                            int temp = Integer.parseInt(codigo.substring(3,5));
                            if(temp>0&&temp<3)
                            {
                                if(codigo.length()==5){resultado=true;}
                            }
                        }
                        else if (ultimaHoja==1||ultimaHoja==2||ultimaHoja==4||ultimaHoja==5||ultimaHoja==7||ultimaHoja==8||ultimaHoja==9)
                        {
                            if (codigo.length() >2&&codigo.length() <4) {
                                resultado = true;
                            }
                        }
                    } 
            }        
                    break;
                     case '7':
                    //nivel 7
                    if (codigo.length()>4 && codigo.length()<7)
                                        {
                    
                        cc = codigo.substring(4,5);
                            
                    ultimaHoja = Integer.parseInt(cc);

                    if (ultimaHoja > 0 && ultimaHoja < 8) {
                        if (codigo.length() == 5) {
                            resultado = true;
                        }
                    }
                    }
                    
                    break;

                case '8':
                    //nivel 8
                    if (codigo.length() == 3) {
                        resultado = true;
                    }
                    break;

            }

        }
            
        }
        
        
        
        
        return resultado;
    }
    
    
}//fin calse



