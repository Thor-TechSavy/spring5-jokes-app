package com.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by shivam (techSavyThor) on 05/01/2019
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

       public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
