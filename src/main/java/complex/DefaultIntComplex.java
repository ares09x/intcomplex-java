package complex;

public class DefaultIntComplex implements IntComplex {

    int real;
    int imag;

    public DefaultIntComplex(int real, int imag) {
        this.real = real;
        this.imag = imag;

    }
    @Override
    public int real(){
        return real;
    }
    @Override
    public int imag(){
        return imag;
    }

    @Override
    public IntComplex twitch() {
        int  temp;
        temp=real();
        real=imag();
        imag= temp;
        return this;
    }


    @Override
    public String toString (){
        return  (real + "+" + imag + "i");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IntComplex) {
            DefaultIntComplex other = (DefaultIntComplex) obj;
            return (
                    this.real == other.real &&
                            this.imag == other.imag
            );
        }
        return false;
    }

}
