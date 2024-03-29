package endurteam.habirance.world.item;

import endurteam.habirance.Habirance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial
{
	;
	private static final int[] HEALTH_PER_SLOT = new int[] {13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final Supplier<Ingredient> repairIngredient;

	ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_)
	{
		this.name = p_40474_;
		this.durabilityMultiplier = p_40475_;
		this.slotProtections = p_40476_;
		this.enchantmentValue = p_40477_;
		this.sound = p_40478_;
		this.toughness = p_40479_;
		this.knockbackResistance = p_40480_;
		this.repairIngredient = p_40481_;
	}

	public int getDurabilityForSlot(@NotNull EquipmentSlot pSlot)
	{
		return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
	}

	public int getDefenseForSlot(@NotNull EquipmentSlot pSlot)
	{
		return this.slotProtections[pSlot.getIndex()];
	}

	public int getEnchantmentValue()
	{
		return this.enchantmentValue;
	}

	public @NotNull SoundEvent getEquipSound()
	{
		return this.sound;
	}

	public @NotNull Ingredient getRepairIngredient()
	{
		return this.repairIngredient.get();
	}

	public @NotNull String getName()
	{
		return Habirance.MOD_ID + ":" + this.name;
	}

	public float getToughness()
	{
		return this.toughness;
	}

	/**
	 * Gets the percentage of knockback resistance provided by armor of the material.
	 */
	public float getKnockbackResistance()
	{
		return this.knockbackResistance;
	}
}
