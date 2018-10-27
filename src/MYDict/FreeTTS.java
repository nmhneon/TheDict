/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYDict;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author Administrator
 */
public class FreeTTS {
 private String text; // string to speech
 
    /**
     *Constructor
     * @param text
     */
    public FreeTTS(String text) {
  this.text = text;
 }
 
    /**
     *Speak the word by 1st voice
     */
    public void speak1() {
  Voice voice;
  VoiceManager voiceManager = VoiceManager.getInstance();
  System.setProperty("mbrola.base","E:\\Desktops\\Dictionary\\bin\\mbrola");
  voice = voiceManager.getVoice("mbrola_us1");
  voice.allocate();
  voice.speak(text);
 }
 
    /**
     *Speak the word by 2nd voice
     */
    public void speak2() {
  Voice voice;
  VoiceManager voiceManager = VoiceManager.getInstance();
  System.setProperty("mbrola.base","E:\\Desktops\\Dictionary\\bin\\mbrola");
  voice = voiceManager.getVoice("mbrola_us2");
  voice.allocate();
  voice.speak(text);
 }
 
    /**
     *Speak the word by 3rd voice
     */
    public void speak3() {
  Voice voice;
  VoiceManager voiceManager = VoiceManager.getInstance();
  System.setProperty("mbrola.base","E:\\Desktops\\Dictionary\\bin\\mbrola");
  voice = voiceManager.getVoice("mbrola_us3");
  voice.allocate();
  voice.speak(text);
 }
    
}
