/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keychainabstractfactorydesign.keychainabstractfactorydesign;

public abstract class KeyChainShop {
    public KeyChain orderKeychain(String type){
        KeyChain keychain;
        keychain = createKeychain(type);
        keychain.manufacturing();
        keychain.packaging();
        keychain.delivery();
        
        return keychain;
    }
    
    protected abstract KeyChain createKeychain(String type);
}
