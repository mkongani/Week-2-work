/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keychainabstractfactorydesign.keychainabstractfactorydesign;

public abstract class KeyChain {
    String name;
    String material;
    double size;
     void manufacturing(){
         System.out.println("Manufacturing: "+ name);
         System.out.println("Using material: " +material);
         System.out.println("Size: "+size);
     }
     
     void packaging(){
         System.out.println("Packing the "+name);
     }
     
     void delivery(){
         System.out.println("Delivering the "+name);
     }
     
     public String getName(){
         return name;
     }
}
