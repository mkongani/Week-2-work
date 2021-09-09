/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keychainabstractfactorydesign.keychainabstractfactorydesign;

public class PersonalizedKeychain extends KeyChainShop {

    @Override
    protected KeyChain createKeychain(String material) {
         if(material.equals("wooden")){
          return new PKWoodenKeychain();
         } else if (material.equals("metal")){
             return new PKMetalKeychain();
         } else if(material.equals("plastic")){
             return new PKPlasticKeychain();
         } else if(material.endsWith("steel")){
             return new PKSteelKeychain();
         } else return null;
    }
    
}
