//package main.java.jp.co.systena.tigerscave.springhellosystena.application.model;
//https://tsuyopon.xyz/2019/01/14/how-to-create-classes-and-instances-in-js/
public class Item {
  //コンストラクタ
  constructor(itemId, name, price) {
    this.itemId = itemId;
    this.name = name;
    this.price = price;
  }
}
  const items1 = new Item(1, '商品A', 100);
  const items2 = new Item(2, '商品B', 200);
  const items3 = new Item(3, '商品C', 300);

  //インスタンスの値を確認
  console.log('items1.itemId: ', items1.itemId);
}
