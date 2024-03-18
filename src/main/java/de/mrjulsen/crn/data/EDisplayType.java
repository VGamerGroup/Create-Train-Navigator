package de.mrjulsen.crn.data;

import java.util.Arrays;

import de.mrjulsen.crn.client.gui.ModGuiIcons;
import de.mrjulsen.mcdragonlib.common.ITranslatableEnum;
import net.minecraft.util.StringRepresentable;

public enum EDisplayType implements StringRepresentable, ITranslatableEnum{
	TRAIN_DESTINATION(0, "train_destination", ModGuiIcons.TRAIN_DESTINATION),
    PASSENGER_INFORMATION(1, "passenger_information", ModGuiIcons.PASSENGER_INFORMATION),
	PLATFORM(2, "platform", ModGuiIcons.PLATFORM_INFORMATION);
	
	private String name;
	private int id;
	private ModGuiIcons icon;
	
	private EDisplayType(int id, String name, ModGuiIcons icon) {
		this.name = name;
		this.id = id;
		this.icon = icon;
	}
	
	public String getInfoTypeName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}	

	public ModGuiIcons getIcon() {
		return icon;
	}

	public static EDisplayType getTypeById(int id) {
		return Arrays.stream(values()).filter(x -> x.getId() == id).findFirst().orElse(EDisplayType.TRAIN_DESTINATION);
	}

    @Override
    public String getSerializedName() {
        return name;
    }

	@Override
	public String getEnumName() {
		return "display_type";
	}

	@Override
	public String getEnumValueName() {
		return this.name;
	}
}
