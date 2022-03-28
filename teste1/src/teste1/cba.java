package teste1;

public class cba {

	private int i;
	private int j;
	private int[] vet;
	private int arg;

	
	public boolean pesq_reg(int vet[], int arg){
		this.vet = vet;
		this.arg = arg;
		return pesq_bin(0, vet.length -1);
	}


	public boolean pesq_bin(int i, int j){
		if(i==j){
			if(vet[i]==arg)
				return true;
			else
				return false;
		}else
			return pesq_bin(i,(i+j)/2)||pesq_bin((i+j)/2+1,j);
	}


	public static void main(String args[]){
		cba pesq = new cba();

		int[] vet = {0,1,7,3,4,5,6,4,8,9,1}; // exemplo para demonstração

		System.out.println(pesq.pesq_reg(vet,7));
}
} 