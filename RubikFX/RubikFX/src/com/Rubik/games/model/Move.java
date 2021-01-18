package com.Rubik.games.model;

/**
 *
 * @author MadhusaraAriyawansha, April 2020 - BEE-9X Innovation Labs
 */
public class Move{
    private String face;
    private long timestamp;
    
    public Move(String face, long timestamp){
        this.face=face;
        this.timestamp=timestamp;
    }
    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Move{" + "face=" + face + ", timestamp=" + timestamp + '}';
    }

}
