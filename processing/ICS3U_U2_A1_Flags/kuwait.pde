// Japan FLAG: HARD CODED
void kuwait() {
  
  // SETUP
  rectMode( CENTER );
  
  // green part of the flag
  fill( 100, 200, 0 );
  stroke(0,0,0,0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // red part of the flag55
  fill( 255, 0, 0 );
  stroke(0,0,0,0);
  rect( 
    xFlagCenter, yFlagCenter + (FLAG_FACTOR_HEIGHT * FLAG_SIZE)/3, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE)/3
  );
  
  //black triangle of the flag
  fill(0);
  stroke(0,0,0,0);
  triangle(xFlagCenter, yFlagCenter, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, 
  yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2, xFlagCenter - FLAG_FACTOR_WIDTH * 
  FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2); 
 
  // white part of the flag
  fill( 255, 255, 255 );
  stroke(0,0,0,0);
  rect( 
    xFlagCenter+(FLAG_FACTOR_WIDTH* FLAG_SIZE)/6, yFlagCenter, 
   FLAG_FACTOR_WIDTH * FLAG_SIZE-FLAG_FACTOR_WIDTH * FLAG_SIZE*0.333, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE)/3
  );
}

//5