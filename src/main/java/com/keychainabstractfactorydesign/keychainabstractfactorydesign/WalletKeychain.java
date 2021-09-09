/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keychainabstractfactorydesign.keychainabstractfactorydesign;

public class WalletKeychain extends KeyChainShop {
    @Override
    protected KeyChain createKeychain(String material) {
         if(material.equals("wooden")){
          return new WalletWoodenKeychain();
         } else if (material.equals("metal")){
             return new WalletMetalKeychain();
         } else if(material.equals("plastic")){
             return new WalletPlasticKeychain();
         } else if(material.endsWith("steel")){
             return new WalletSteelKeychain();
         } else return null;
    }
}
