/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0058;

/**
 *
 * @author PHONG VU
 */
public class Word {
    private String English;
    private String VietNam;

    public Word() {
    }

    public Word(String English, String VietNam) {
        this.English = English;
        this.VietNam = VietNam;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String English) {
        this.English = English;
    }

    public String getVietNam() {
        return VietNam;
    }

    public void setVietNam(String VietNam) {
        this.VietNam = VietNam;
    }
    
    
}
