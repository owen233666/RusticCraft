// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Teapot<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "teapot_converted_converted"), "main");
	private final ModelPart root;
	private final ModelPart handle;
	private final ModelPart woodenhandle;
	private final ModelPart mouth;

	public Teapot_Converted_Converted(ModelPart root) {
		this.root = root.getChild("root");
		this.handle = this.root.getChild("handle");
		this.woodenhandle = this.handle.getChild("woodenhandle");
		this.mouth = this.woodenhandle.getChild("mouth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -7.0F, -1.0F, 10.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-9.0F, -9.0F, 0.0F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-11.0F, -7.0F, 0.0F, 12.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 24.0F, -5.0F));

		PartDefinition handle = root.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(44, 8).addBox(-1.0F, -9.0F, 6.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(44, 10).addBox(-1.0F, -16.05F, 3.075F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(44, 12).addBox(-1.0F, -9.0F, -6.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(44, 20).addBox(-1.0F, -16.075F, -3.075F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 5.0F));

		PartDefinition cube_r1 = handle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 26).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.65F, 4.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = handle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 24).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8F, 5.25F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = handle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 6.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = handle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 18).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.675F, -4.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = handle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 16).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.825F, -5.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = handle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 14).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, -6.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition woodenhandle = handle.addOrReplaceChild("woodenhandle", CubeListBuilder.create().texOffs(36, 36).addBox(-0.5F, -15.775F, -3.075F, 1.0F, 1.0F, 6.15F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouth = woodenhandle.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(44, 30).addBox(-1.0F, 7.4588F, 6.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -14.775F, 3.525F));

		PartDefinition cube_r7 = mouth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 32).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.25F, 7.45F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = mouth.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 28).addBox(-0.5F, -0.9912F, 0.0262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.775F, 6.35F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = mouth.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 11.675F, 5.1F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r10 = mouth.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 10.025F, 6.175F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = mouth.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 43).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 12.775F, 3.475F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}