/*
 * ICS3U.2016.17.S1
 * 
 * Assignment #1: Flags
 *
 * Author:   Mr. Muir
 * Date:     2016-17.S1
 * Version:  2016.17.S1.02
 */
 
// CONSTANTS
int FLAG_SIZE = 200;
int FLAG_FACTOR_WIDTH = 3;
int FLAG_FACTOR_HEIGHT = 2;

// VARIABLES
int xFlagCenter;
int yFlagCenter;

// WINDOW SETUP
void setup() {
  size(800, 600);
  xFlagCenter = width / 2;
  yFlagCenter = height / 2;
  background( 255 );
  menu();
}

// IGNORE
void draw() {
  
}

// DISPLAY MENU
void menu() {
  background( 255 );
  textSize(12);
  fill( 0, 0, 255 );
  text("0. Japan", 10, 15); 
  text("1. Botswana", 10, 30);
  text("2. Bahamas", 10, 45); 
  text("3. Cuba", 10, 60); 
  text("4. Mauritania", 10, 75);
  text("5. Kuwait", 10, 90); 
  text("6. Seychelles", 10, 105); 
  text("7. South Africa", 10, 120);
}

// MENU LOGIC
void keyPressed() {
  menu();
  switch( key ) {
    case '0': 
      japan();
      break;
    case '1':
      botswana();
      break;
    case '2':
      bahamas();
      break;
    case '3':
      cuba();
      break;
    case '4':
      mauritania();
      break;
    case '5':
      kuwait();
      break;
    case '6':
      seychelles();
      break;
    case '7':
      //southAfrica();
      break;
  }
}

// STAR SHAPE
void star(float x, float y, float radius1, float radius2, int npoints) {
  float angle = TWO_PI / npoints;
  float halfAngle = angle/2.0;
  beginShape();
  for (float a = 0; a < TWO_PI; a += angle) {
    float sx = x + cos(a) * radius2;
    float sy = y + sin(a) * radius2;
    vertex(sx, sy);
    sx = x + cos(a+halfAngle) * radius1;
    sy = y + sin(a+halfAngle) * radius1;
    vertex(sx, sy);
  }
  endShape(CLOSE);
}