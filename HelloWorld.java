/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author macstudent
 */
public class HelloWorld {
    public static void main(String agrs[]){
            System.out.println("Hello World");
            int number = 10;
            float fnumber = 10.2f;
            double dnumber = 10.23455;
            short n1;
            long n2;
            
            number *= 10;
            System.out.println("number :" + number);
            
            number = 20;
            System.out.println("number : " + (number + 10));
            System.out.println(10 + number + "number : ");
            
            
            char ch = 'a';
            System.out.println("ch : " + ch);
            System.out.println("ch : " + (char)(ch + 1));
            
            ch++;
            System.out.println("ch : " + ch);
            
            ch++;
            System.out.println("ch : " + ch);
            
            ++ch;
            System.out.println("ch : " + ch);
            
            ch = 'c';
            
            char anotherCh = --ch;
            System.out.println("ch : " + ch);
            System.out.println("anotherch : " + anotherCh);
            
            String name = "AB";
            System.out.println("Name : " + name);
            
            boolean flag = false;
            System.out.println("flag : " + flag);
            
            if (!flag){
                System.out.println("Name : " + name);
            } else {
                System.out.println("Name is missing");
            }
            
            char vowel = 'o';
            
            switch(vowel){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Given character is vowel");
                    break;
                default:
                    System.out.println("Given character is not a vowel");
                    break;
            }
            
            switch(10+20){
                case 10:
                    System.out.println("not match");
                    break;
                case 30:
                    System.out.println("matched");
                default:
                    System.out.println("cannot determine");
                    break;
            }
            
            String province = "ch";
            switch(province){
                case "ON":
                    System.out.println("Ontario");
                    break;
                case "AB":
                    System.out.println("Alberta");
                    break;
                case "NV":
                    System.out.println("Nova Scotia");
                    break;
                default:
                    System.out.println("Don't know");
                    break;
                
            }
    }

    /**
     * @param args the command line arguments
     */
    }
    

