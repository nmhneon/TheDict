/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYDict;

/**
 *
 * @nmh
 */
public class Word {
    private String wordTarget;
    private String wordExplain;
    
    /**
     *getter for Word Target
     * @return
     */
    public String getWordTarget() {
		return wordTarget;
	}

    /**
     *setter for Word Target
     * @param wordTarget
     */
    public void setWordTarget(String wordTarget) {
		this.wordTarget = wordTarget;
	}

    /**
     *getter for Word Explain
     * @return
     */
    public String getWordExplain() {
		return wordExplain;
	}

    /**
     *setter for Word Explain
     * @param wordExplain
     */
    public void setWordExplain(String wordExplain) {
		this.wordExplain = wordExplain;
	}
    
}
