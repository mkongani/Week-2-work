/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keychainabstractfactorydesign.keychainabstractfactorydesign;

public class KeyChainTestDrive {
    public static void main(String[] args){
        KeyChainShop pkeychain = new PersonalizedKeychain();
        KeyChainShop dkeychain = new DecorativeKeychain();
        
        KeyChain keychain = pkeychain.orderKeychain("wooden");
        System.out.println("John ordered a " +keychain.getName() + "\n");
        
        keychain = dkeychain.orderKeychain("wooden");
        System.out.println("Micheal ordered a " +keychain.getName() + "\n");
    }
    
}
