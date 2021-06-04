public class DogClient {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog("Baobei", 5), new Dog("Jiaozi", 7),
                      new Dog("Xiaxue", 20)};

        Dog maxDog = (Dog) StatLib.max(dogs);
        maxDog.bark();
    }

}