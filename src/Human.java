import java.util.List;

public class Human {

	private List<String> weaknesses = new List<String>();
	private List<String> status_effects = new List<String>();
	private float sanity_lvl;
	private float corruption_lvl;
	private int current_mana;
	private int max_mana;
	private int current_HP;
	private int max_HP;
	private boolean is_caster;

	// getters
	public List<String> get_weaknesses() { return this.weaknesses; }
	public List<String> get_status_effects() { return this..status_effects; }
	public float get_sanity_lvl() { return this.sanity_lvl; }
	public float get_corruption_lvl() { return this.corruption_lvl; }
	public int get_current_mana() { return this.current_mana; }
	public int get_max_mana() { return this.max_mana; }
	public int get_current_HP() { return this.current_HP; }
	public int get_max_HP() { return this.max_HP; }
	public boolean get_is_Caster() { return this.is_caster; }

	// setters
	public void set_weaknesses(List<String> ws) { this.weaknesses = ws; }
	public void set_status_effects(List<String> se) { this.status_effects = se; }
	public void set_sanity_lvl(float sl) { this.sanity_lvl = sl; }
	public void set_corruption_lvl(float cl) { this.corruption_lvl = cl; }
	public void set_current_mana(int cm) { this.current_mana = cm; }
	public void set_max_mana(int mm) { this.max_mana = mm; }
	public void set_current_HP(int ch) { this.current_HP = ch; }
	public void set_max_HP(int mh) { this.max_HP = mh; }
	public void set_is_caster(boolean ic) { this.is_caster = ic; }

	// constructors
	public Human() {}

	// methods
	

}