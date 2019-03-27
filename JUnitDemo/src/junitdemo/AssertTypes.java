/*
 * Class meant to hold data of quite a few Assert types. 
 * And maybe be a little entertaining, if you're a comic book nerd like me.
 */
package junitdemo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamesK
 */

public class AssertTypes {
    
    public void AssertTypes() {
    }
    
    @Test
    public void PassingTest() {
        // assertEquals example
        // assertEquals Asserts that the two arguments are the same,
        // and throws an error when returned false.
        String a = "foo";
        String aa = "foo";
        assertEquals(a, aa);
        
        // assertNull example
        // assertNull asserts that a given object is null, and will throw
        // an error if returned false
        List<String> justiceLeague = null;
        assertNull(justiceLeague);
        
        // test to see if both are null
        // THIS IS A CHANGE BASED ON FLUENCY REVIEW FEEDBACK
        List<String> nullVariable = null;
        assertEquals(justiceLeague, nullVariable);
        
        
        // assertNotNull example
        // adding the various members of the justice league that I could 
        // think of off hand should make the object no longer null
        justiceLeague = new ArrayList();
        justiceLeague.add("Superman");
        justiceLeague.add("Wonder Woman");
        justiceLeague.add("Batman");
        justiceLeague.add("Aquaman");
        justiceLeague.add("Shazam");
        justiceLeague.add("Booster Gold");
        justiceLeague.add("Plastic Man");
        justiceLeague.add("The Flash");
        assertNotNull(justiceLeague);
        
        // assertTrue example
        // superman is stronger than batman.
        int supermanStrength = 99;
        int batmanStrength = 6;
        assertTrue(supermanStrength > batmanStrength);
        
        // Hyperion from Marvel Comics held two universes apart with his bare hands.
        // this particular assertEquals has a delta parameter for margin of error. 
        // This is meant to demonstrate that for all intents and purposes, Hyperion and Superman
        // are functionally the same, though Hyperion is probably more powerful. 
        int hyperionStrength = 100;
        assertEquals(supermanStrength, hyperionStrength, 50);   
        
        // assertFalse example
        // it's true, booster gold is famous for how lame he is
        Boolean boosterGoldCool = false;
        assertFalse(boosterGoldCool);
        
        // Blue Beetle is also kind of lame
        // THIS IS A CHANGE BASED ON FLUENCY REVIEW FEEDBACK
        Boolean blueBeetleCool = false;
        assertFalse(blueBeetleCool);
        
        // but at least they have each other
        // THIS IS A CHANGE BASED ON FLUENCY REVIEW FEEDBACK
        Boolean blueBeetleboosterGoldFriends = true;
        assertTrue(blueBeetleboosterGoldFriends);
        assertEquals(blueBeetleCool, boosterGoldCool);
        
        // assertSame example
        // they got their powers from the same guy, a wizard named Shazam.
        // also, shazam was called Captain Marvel originally, despite not being
        // a Marvel property, and was until 2012 when Marvel won a lawsuit.
        String whatShazamYellsToTransform = "SHAZAM!";
        String whatBlackAdamYellsToTransform = "SHAZAM!";
        assertSame(whatShazamYellsToTransform, whatBlackAdamYellsToTransform);
       
        // assertEquals also works here
        // THIS IS A CHANGE BASED ON FLUENCY REVIEW FEEDBACK
        assertEquals(whatShazamYellsToTransform, whatBlackAdamYellsToTransform);
        
        // assertNotSame example
        // DC's Captain Marvel is now called Shazam, see above. 
        String MarvelsCaptainMarvel = "Carol Danvers";
        String DCsCaptainMarvel = "Billy Batson";
        assertNotSame(MarvelsCaptainMarvel, DCsCaptainMarvel);
        
        // assertArrayEquals example
        // These characters have all been on both sides.
        // The Stepford Cuckoos are a set of 3 clones of Emma Frost
        // Jason Todd was Batman's second Robin after Dick Grayson, until he was killed by the Joker
        // and eventually resurrected as a result of a reality-altering event, at which point 
        // he became a Batman villain for a bit.
        // Cyclops became a bad guy in like 2016 I think? It was after he got a part of the Phoenix Force.
        String[] comicCharactersThatHaveBeenHeroes = {"Cyclops", "The Stepford Cuckoos", "Jason Todd", "Emma Frost"};
        String[] comicCharactersThatHaveBeenVillains = {"Cyclops", "The Stepford Cuckoos", "Jason Todd", "Emma Frost"};
        assertArrayEquals(comicCharactersThatHaveBeenHeroes, comicCharactersThatHaveBeenVillains);
    }
    
    @Test
    public void FailingTest() {
        
        // This one is shorter because it fails on the first test anyway, and I have a lot of other hw to do.
        String a = "foo";
        String b = "bar";
        assertEquals(a, b);
        
        List<String> avengers = new ArrayList();
        avengers.add("Iron Man");
        avengers.add("Captain America");
        avengers.add("The Incredible Hulk");
        avengers.add("Thor");
        avengers.add("Black Widow");
        avengers.add("Hawkeye");
        avengers.add("Falcon");
        avengers.add("Spiderman");
        assertNull(avengers);
    }
    
}
