package id.putraprima.skorbola.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Score implements Parcelable {
    private String nama;
    private int minutes;

    public Score(String nama, int minutes) {
        this.nama = nama;
        this.minutes = minutes;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeInt(this.minutes);
    }

    protected Score(Parcel in) {
        this.nama = in.readString();
        this.minutes = in.readInt();
    }

    public static final Creator<Score> CREATOR = new Creator<Score>() {
        @Override
        public Score createFromParcel(Parcel source) {
            return new Score(source);
        }

        @Override
        public Score[] newArray(int size) {
            return new Score[size];
        }
    };
}
