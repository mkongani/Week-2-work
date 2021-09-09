/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keychainabstractfactorydesign.keychainabstractfactorydesign;

public class DecorativeKeychain extends KeyChainShop {
    @Override
    protected KeyChain createKeychain(String material) {
         if(material.equals("wooden")){
          return new DecorativeWoodenKeychain();
         } else if (material.equals("metal")){
             return new DecorativeMetalKeychain();
         } else if(material.equals("plastic")){
             return new DecorativePlasticKeychain();
         } else if(material.endsWith("steel")){
             return new DecorativeSteelKeychain();
         } else return null;
    }
}
