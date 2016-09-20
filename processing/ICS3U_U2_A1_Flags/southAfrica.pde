// southAfrica FLAG: HARD CODED
void southAfrica() {
  
  // SETUP
  rectMode( CENTER );
  
  //FLAG BORDER (red)
  fill( 212,0,0 );
  stroke(0,0,0,0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  //Blue 
  fill( 0,0,212 );
  stroke(0,0,0,0);
  rect( 
    xFlagCenter, yFlagCenter+FLAG_FACTOR_HEIGHT * FLAG_SIZE/4, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE/2);
    
  //white triangle
  fill(255,255,255);
  stroke(0,0,0,0);
  triangle(xFlagCenter+40, yFlagCenter, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, 
  yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2-50, xFlagCenter - FLAG_FACTOR_WIDTH * 
  FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2+50); 
  
  //white rect
  fill(255,255,255);
  noStroke();
  rect(xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE/4+10);
    
  //green triangle
  fill(4,122,43);
  stroke(0,0,0,0);
  triangle(xFlagCenter, yFlagCenter, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, 
  yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/2-20, xFlagCenter - FLAG_FACTOR_WIDTH * 
  FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/2+20); 
  
  //green rect
  fill(4,122,43);
  noStroke();
  rect(xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE/4-30);
 
  //yellow triangle
  fill(255,204,0);
  stroke(0,0,0,0);
  triangle(xFlagCenter-FLAG_FACTOR_WIDTH * FLAG_SIZE*0.2, yFlagCenter, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, 
  yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/3, xFlagCenter - FLAG_FACTOR_WIDTH * 
  FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/3); 

  //black triangle
  fill(0,0,0);
  stroke(0,0,0,0);
  triangle(xFlagCenter-FLAG_FACTOR_WIDTH * FLAG_SIZE*0.27, yFlagCenter, xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE/2, 
  yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE/4, xFlagCenter - FLAG_FACTOR_WIDTH * 
  FLAG_SIZE/2, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE/4);     

  //extra white part
  fill(255,255,255);
  stroke(0,0,0,0);
  rect(xFlagCenter, yFlagCenter- FLAG_FACTOR_HEIGHT * FLAG_SIZE, FLAG_FACTOR_WIDTH * FLAG_SIZE+5, 
  FLAG_FACTOR_HEIGHT * FLAG_SIZE );   
 
  //extra white part
  fill(255,255,255);
  stroke(0,0,0,0);
  rect(xFlagCenter, yFlagCenter+ FLAG_FACTOR_HEIGHT * FLAG_SIZE, FLAG_FACTOR_WIDTH * FLAG_SIZE+5, 
  FLAG_FACTOR_HEIGHT * FLAG_SIZE ); 
  
  
  
  
}