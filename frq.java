public class frq{
    public static class Feeder{
        private int currentFood;
        public Feeder(){
            currentFood = 1000;
        }
        public void simulateOneDay(int numBirds){
            if (Math.random() < 0.05){
                currentFood = 0;
            }
            else{
                int eaten = (int) (Math.random() * 41)+10;
                currentFood -= (eaten * numBirds);
                if (currentFood < 0){
                    currentFood = 0;
                }
            }
                
        }
            
    }


    public static void main(String[] args) {
        Feeder meow = new Feeder();
        meow.simulateOneDay(5);
    }
}