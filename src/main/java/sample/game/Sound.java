package sample.game;

import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class Sound {
    private Clip clip;

    public Sound(String soundUrl) throws Exception {
        URL url = new URL(soundUrl);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
        clip = AudioSystem.getClip();
        clip.open(audioStream);
    }

    public void play() {
        clip.setFramePosition(0);
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }

    public void setVolume(float volume) {
        FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volumeControl.setValue(volume);
    }

    public static void main(String[] args) throws Exception {
        String backgroundUrl = "https://www.dropbox.com/scl/fi/mb2oriy1rnqik15fwwpyt/741558_the_ramdom_cheese_echos-of-the-mead-hall-online-audio-converter.com.wav?rlkey=m6h0ag0awxvj71ftwrgenxa8p&dl=1";
        String magicUrl = "https://www.dropbox.com/scl/fi/cpfztjtyxbolknq66iw9o/524197__department64__d64-samplepack-fx-powerup-34.wav?rlkey=bhpmx6a9jjydlcv6azp7uh44e&dl=1";
        String themeUrl = "https://www.dropbox.com/scl/fi/ukaczgwifhx65tqhygqnw/646460_g-14_medieval-march-mp3-online-audio-converter.com.wav?rlkey=d77d8w0tlo4x4ib4dtakwybxp&st=c0d7uhj4&dl=1";

        Sound backgroundSound = new Sound(backgroundUrl);
        Sound magicSound = new Sound(magicUrl);
        Sound themeSound = new Sound(themeUrl);
        // Volume
        backgroundSound.setVolume(-10.0f);

        backgroundSound.loop();

        // Simulate a magic attack sound, for example after 5 seconds
        Timer timer = new Timer(5000, e -> {
            magicSound.play();
        });
        timer.setRepeats(true);
        timer.start();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null, "Press OK to stop the background sound.");
                backgroundSound.stop();
            }
        });
    }
}