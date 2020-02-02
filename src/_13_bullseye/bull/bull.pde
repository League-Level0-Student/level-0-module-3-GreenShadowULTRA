int e=600; 
size (850, 850); 

  fill(0,0,0); 
  
  ellipse(425, 425, 700,700); 

for(int i=0; i<= 7; i++) {
 if (i%2==0){ 
  fill(0,255,0); 
  
  ellipse(425, 425, e,e); 
  e-=100;
 }
 else{
   fill(0,0,0); 
  
  ellipse(425, 425, e,e); 
  
  e-=100; 
 }
 
}
