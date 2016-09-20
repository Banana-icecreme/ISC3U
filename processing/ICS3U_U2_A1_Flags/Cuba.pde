// cuba FLAG: HARD CODED
void cuba() {
  
  // SETUP
  rectMode( CENTER );
  
  // blue part of the flag
  fill( 0, 0, 255 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
   // white stirps of the flag 
  fill( 255, 255, 255 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.6
  );
  
     // white stirps of the flag
  fill( 0, 0, 255 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.2);
  
  //red triangle of the flag
  fill(255,0,0);
  stroke(0);
  triangle(xFlagCenter-xFlagCenter/5, yFlagCenter, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2); 

  
  // STAR SHAPE
  fill(255,255,255);
  stroke(0);
  star(xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/3, yFlagCenter, 70, 30, 5);

}

//3