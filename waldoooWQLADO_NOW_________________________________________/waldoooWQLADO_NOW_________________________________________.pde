void setup() {
  PImage yes = loadImage("yes.jpg"); // Change this to match your file name.
  size(500, 500);
  image(yes, 75,125);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
  PImage waldo = loadImage("waldo.png");
  image(waldo, 75, 125);
 
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
print("X: "+ mouseX + " Y: " +mouseY +" " );
      // If the mouse is on Waldo, print “Waldo found!”
      int x = mouseX;
      int y = mouseY;
if(mouseX<190){
x=1930;
}
if(mouseX>250){
 x=2520; 
}
if(mouseY>130){
 y=1303; 
}
if(mouseY<211){
  y=2211;
}
if(mouseY==175){
  y=175;
}
if(mouseX==203){
  x=203;
}
if(y==211){
 print("");
 
}
if(y==130){
 print(""); 
 playWoohoo();
}
if(x==250){
 print(""); 
 playWoohoo();
}
if(x==190){
 print(""); 
 
}
if(x==190&&y==211){
 playWoohoo();
 print("U FOUND WALDO EEEEEEEEEEEE");
}
if(x==203&&y==175){
 playWoohoo();
 print("BEANOS BEAN SO SOBEANOS BEONS");
}
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
