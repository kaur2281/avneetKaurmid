/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * june 24th
 * @author srinivsi
 * modifier- Avneet Kaur
 */
public class StausUser 
{
    public enum StatusUser{
        REJECTED,PENDING,PROCESSING,APPROVED;
    }
   public void statusDetail(int code){
switch(code)
        {
        case 0: System.out.println(StatusUser.REJECTED);
        break;
        case 1: System.out.println(StatusUser.PENDING);
        break;
        case 2:
        System.out.println(StatusUser.PROCESSING);
        break;
        case 3: 
            System.out.println(StatusUser.APPROVED);
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
}
