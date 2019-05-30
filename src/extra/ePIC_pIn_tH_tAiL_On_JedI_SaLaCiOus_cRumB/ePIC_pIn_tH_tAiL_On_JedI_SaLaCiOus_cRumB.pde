import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

Minim minim = new Minim(this);     //In the setup method

PImage donkey;
PImage tail;

void setup() {

  size(1023, 750);     //replace width, height with your picture's dimensions
woohooSound = minim.loadSample("Salacious Crumb LAUGHING.wav");     //In setup. Change the file name if you need to
  donkey = loadImage("JediSalaciousCrumb.png");      //change the file name if you need to
  tail = loadImage("ePicTaIL.png");      //change the file name if you need to
tail.resize(200, 200);     //replace width, height with your tail's dimensions

}
void draw() {
  background (donkey);
  image(tail, mouseX, mouseY);

  tail.resize(width, height);     //replace width, height with your tail's dimensions

  image(tail, mouseX-10, mouseY-20);

  rect(0, 0, 30, 30);

  rect(454, 75, 40, 40);

 // dist(0, 0, mouseX, mouseY) < 30



if (playSound) {
  woohooSound.trigger();
  playSound = false;
}



    textSize(24);
  text("Message", 100, 20);
}
// put these lines where you want the sound to play
