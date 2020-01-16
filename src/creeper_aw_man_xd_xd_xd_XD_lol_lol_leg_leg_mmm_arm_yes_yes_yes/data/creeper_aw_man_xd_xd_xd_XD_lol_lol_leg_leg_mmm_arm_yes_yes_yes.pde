PImage creeper;
 void draw(){
 
 
 image(creeper, mouseX-50, mouseY-50);


 
 
 
 }
 void setup(){
size(500, 500);
   PImage minecraft = loadImage("minecraft.png");     
minecraft.resize(500, 500);         
background(minecraft);         
creeper=loadImage("creeper.png");    
creeper.resize(100, 100);


 }
