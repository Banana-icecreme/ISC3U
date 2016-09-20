// mauritania FLAG: HARD CODED
void seychelles() {
  
  // SETUP
  rectMode( CENTER );
  
  // FLAG BORDER
  fill( 7, 2, 168 );
  stroke(0,0,0,0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  //yellow part
  fill(255,222,0);
  stroke(0,0,0,0);
  triangle(xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2, xFlagCenter-FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2,
  xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter-FLAG_FACTOR_HEIGHT* FLAG_SIZE*2.5);
    
  //red part
  fill(201,8,8);
  stroke(0,0,0,0);
  triangle(xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2, xFlagCenter-FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2,
  xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter-FLAG_FACTOR_HEIGHT* FLAG_SIZE);
  
  //white part
  fill(255,255,255);
  stroke(0,0,0,0);
  triangle(xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2, xFlagCenter-FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2,
  xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter-FLAG_FACTOR_HEIGHT* FLAG_SIZE*0.3);
  
  //green part
  fill(4,122,43);
  stroke(0,0,0,0);
  triangle(xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2, xFlagCenter-FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2,
  xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE*0.1);
  
  //extra white part
  fill(255,255,255);
  stroke(0,0,0,0);
  rect(xFlagCenter, yFlagCenter- FLAG_FACTOR_HEIGHT * FLAG_SIZE, FLAG_FACTOR_WIDTH * FLAG_SIZE+5, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE ); 
}
  
//6