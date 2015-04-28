package com.gedim.playground.presentation.author;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AuthorBean implements Serializable {

    public String getGravatarImageUrl(String email) {
        String gravUrl = "";
        try {
            byte[] bytesOfMessage = email.getBytes("UTF-8");

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < thedigest.length; ++i) {
                sb.append(Integer.toHexString((thedigest[i] & 0xFF) | 0x100).substring(1, 3));
            }
            gravUrl = sb.toString();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            // TODO: add slf4j logging
            Logger.getLogger(AuthorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "http://www.gravatar.com/avatar/" + gravUrl;
    }
}
