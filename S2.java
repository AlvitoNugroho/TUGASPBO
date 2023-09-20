import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class S2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class S2 extends Actor
{
    /**
     * Act - do whatever the S2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveRandomly(); // Panggil metode untuk bergerak secara acak
    }

    private void moveRandomly() {
        int randomX = Greenfoot.getRandomNumber(11) - 5; // Angka acak antara -5 hingga 5
        int randomY = Greenfoot.getRandomNumber(11) - 5; // Angka acak antara -5 hingga 5

        int newX = getX() + randomX; // Hitung posisi X baru
        int newY = getY() + randomY; // Hitung posisi Y baru

        setLocation(newX, newY); // Atur posisi objek ke posisi baru
    }
}
