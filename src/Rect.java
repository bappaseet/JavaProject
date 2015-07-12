import android.os.Parcel;
import android.os.Parcelable;

publuc final class Rect implements Parcelable {
	
	private int left;
	public int top;
	public int right;
	public int bottom;
}
public static final Parcelable.Creator<Rect> CREATOR = new Parcelable.Creator<Rect>(){
	public Rect createFromParcel(Parcel in){
		return new Rect(in);
		
	}
	public Rect[] newArray(int size){
		return new Rect[size];
	}
};
 public Rect(){
	 
 }
 
 private Rect(Parcel in){
	 readFromParcel(in);
 }
 
 public void writeToParcel(Parcel out){
	 out.writeInt(left);
	 out.writeInt(top);
	 out.writeInt(right);
	 out.writeInt(bottom);
 }
 
 public void readFromParcel(Parcel in){
	 left=in.readInt();
	 top=in.readInt();
	 right=inreadInt();
	 bottom=in.readInt();
 }