package structural.composite.one;

import java.util.ArrayList;

public class Folder {
    private  String name;

    private ArrayList<Folder> folderList = new ArrayList<Folder>();
    private  ArrayList<ImageFile> imageList = new ArrayList<ImageFile>();
    private  ArrayList<TextFile> textList = new ArrayList<TextFile>();

    public Folder(String name){
        this.name = name;
    }

    //增加新的Folder类型的成员
    public void addFolder(Folder f){
        folderList.add(f);
    }

    //删除新的Folder类型的成员
    public void removeFolder(Folder f){
        folderList.remove(f);
    }

    public void addImageFile(ImageFile i){
        imageList.add(i);
    }

    public  void removeImageFile(ImageFile i){
        imageList.remove(i);
    }

    public void addTextFile(TextFile t){
        textList.add(t);
    }

    public void removeTextFile(TextFile t){
        textList.remove(t);
    }

    ///需提供三个不同的方法getChildFolder(int i)、
    // getChildImageFile(int i)和getChildTextFile(int i)来获取成员



    //杀毒方法
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒"); //模拟杀毒
        //如果是Folder类型的成员，递归调用Folder的killVirus()方法
        for(Object obj : folderList) {
            ((Folder)obj).killVirus();
        }
        //如果是ImageFile类型的成员，调用ImageFile的killVirus()方法
        for(Object obj : imageList) {
            ((ImageFile)obj).killVirus();
        }
        //如果是TextFile类型的成员，调用TextFile的killVirus()方法
        for(Object obj : textList) {
            ((TextFile)obj).killVirus();
        }
    }
}
