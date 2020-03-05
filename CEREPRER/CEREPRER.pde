

// X,Y Locations: 473:30,38:78, 176:90
PImage creeper;
void setup(){
  size(500, 500); //in setup method
   PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(500, 500);          //in setup method
background(minecraft);    
  creeper=loadImage("creeper.png");
  creeper.resize(50, 50); 

  image(creeper, 450, 0);
image(creeper, 13, 53);
image(creeper, 150, 64);

}
void draw(){
  int CreepersFound = 0;
   int x = mouseX;
 int Y = mouseY;
 print(" X="+x + " Y="+Y);
 if(mousePressed){
  fill(255,0,0);
   ellipse(mouseX,mouseY,25,25); 
 }
  if(mouseX==473&&mouseY==30&&mousePressed){
       fill(0,255,0);
    ellipse(mouseX,mouseY,30,30); 
    print("Creeper 1 found");
    CreepersFound=+1;
  }
  if(mouseX==38&&mouseY==78&&mousePressed){
   fill(0,255,0);
   ellipse(mouseX,mouseY,30,30);
   print("Creeper 2 found");
   CreepersFound=+1;
  }
  if(mouseX==176&&mouseY==90&&mousePressed){
   fill(0,255,0);
   ellipse(mouseX,mouseY,30,30);
    print("creeper 3 found");
    CreepersFound=+1;
  }
  if(CreepersFound==3){
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
    print(" ALL CREEPERS FOUND! ");
  }
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
     return true; 
else
     return false;
}
