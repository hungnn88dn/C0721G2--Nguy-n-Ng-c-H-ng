package exercise.flower.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;


public class Cart {
    private Map<Flower,Integer> flowers = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Flower,Integer> flowers) {
        this.flowers = flowers;
    }

    public Map<Flower,Integer> getFlowers() {
        return flowers;
    }

    private boolean checkItemInCart(Flower flower){
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            if(entry.getKey().getId().equals(flower.getId())){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Flower, Integer> selectItemInCart(Flower flower){
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            if(entry.getKey().getId().equals(flower.getId())){
                return entry;
            }
        }
        return null;
    }
    private Flower selectItemInCartById(int id){
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            if(entry.getKey().getId() == id){
                return entry.getKey();
            }
        }
        return null;
    }

    public void addFlower(Flower flower){
        if (!checkItemInCart(flower)){
            flowers.put(flower,1);
        } else {
            Map.Entry<Flower, Integer> itemEntry = selectItemInCart(flower);
            Integer newQuantity = itemEntry.getValue() + 1;
            flowers.replace(itemEntry.getKey(),newQuantity);
        }
    }
    public void subFlower(Flower flower){
        if (!checkItemInCart(flower)){
            flowers.put(flower,1);
        } else {
            Map.Entry<Flower, Integer> itemEntry = selectItemInCart(flower);
            Integer newQuantity = itemEntry.getValue() - 1;
            if (itemEntry.getValue() == 0) {
                flowers.remove(itemEntry);
            }
            flowers.replace(itemEntry.getKey(),newQuantity);
        }
    }

    public Integer countFlowerQuantity(){
        Integer flowerQuantity = 0;
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            flowerQuantity += entry.getValue();
        }
        return flowerQuantity;
    }

    public Integer countItemQuantity(){
        return flowers.size();
    }

    public Float countTotalPayment(){
        float payment = 0;
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }
    public Map<Flower,Integer> delete(int id) {
       flowers.remove(selectItemInCartById(id));
       return flowers;
    }
}