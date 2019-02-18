/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author cst
 */
public class StrengthChecker {
    
    private int minLength ;
    private int maxLength ;
    private String[] reqChars;
    private boolean checkLengthPassword;
    private boolean checkCharsPassword;
    
    public void setRequiredLength(int min, int max){
        minLength = min;
        maxLength = max;       
        //code my guts
    }//close method
    
    public void setReqChars(String[] s){
        reqChars = s;
       
    }//close method
    
    public boolean checkPassword(String psswd){
        if (psswd.length()<minLength){
            checkLengthPassword = false;
        }else if(psswd.length()>maxLength){
            checkLengthPassword = false;
        }else{
            for(int i = 0;i<reqChars.length;i++){
                if(psswd.indexOf(reqChars[i])<0){
                    checkCharsPassword = false;
                }else{
                    checkCharsPassword = true;
                }
            }
        }
        //check that password meet length
        return checkLengthPassword&&checkCharsPassword;
    }//close method
    
}//close main
