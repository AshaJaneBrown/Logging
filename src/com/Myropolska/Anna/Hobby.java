package Myropolska.Anna;

public class Hobby {
    private byte byteValue;
    private char charValue;
    private int intValue;
    private short shortValue;
    private long longValue;
    private boolean booleanValue;
    private float floatValue;
    private double doubleValue;
    private String name;
    private int hours;
    private int difficulty;


    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public Hobby(String name, int hours, int difficulty) {
        this.name = name;
        this.hours = hours;
        this.difficulty = difficulty;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName());
    }

    public void tellAboutHobby(){
        System.out.println(this.toString() + ": " + this.name);
    }

}