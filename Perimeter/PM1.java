public double mysteryShape (Shape s) {
  double tmp = 0;
  for (Point p : s.getPoints()) {
    
    if (p.getX() > 0) {
      
      if (p.getY() < 0) {
        tmp = tmp + 1;
      }
    }
  }
  return tmp / getNumPoints(s);    
}

