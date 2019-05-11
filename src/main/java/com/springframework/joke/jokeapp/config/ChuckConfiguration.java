package com.springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by shivam (techSavyThor) on 05/11/2019
 */

//@Configuration
public class ChuckConfiguration {

  //0v  @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
