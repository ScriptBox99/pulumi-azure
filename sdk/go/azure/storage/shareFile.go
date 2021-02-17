// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a File within an Azure Storage File Share.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/storage"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleAccount, err := storage.NewAccount(ctx, "exampleAccount", &storage.AccountArgs{
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			Location:               exampleResourceGroup.Location,
// 			AccountTier:            pulumi.String("Standard"),
// 			AccountReplicationType: pulumi.String("LRS"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleShare, err := storage.NewShare(ctx, "exampleShare", &storage.ShareArgs{
// 			StorageAccountName: exampleAccount.Name,
// 			Quota:              pulumi.Int(50),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = storage.NewShareFile(ctx, "exampleShareFile", &storage.ShareFileArgs{
// 			StorageShareId: exampleShare.ID(),
// 			Source:         pulumi.String("some-local-file.zip"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:storage/shareFile:ShareFile example https://account1.file.core.windows.net/share1/file1
// ```
type ShareFile struct {
	pulumi.CustomResourceState

	// Sets the file’s Content-Disposition header.
	ContentDisposition pulumi.StringPtrOutput `pulumi:"contentDisposition"`
	// Specifies which content encodings have been applied to the file.
	ContentEncoding pulumi.StringPtrOutput `pulumi:"contentEncoding"`
	// The MD5 sum of the file contents. Changing this forces a new resource to be created.
	ContentMd5 pulumi.StringPtrOutput `pulumi:"contentMd5"`
	// The content type of the share file. Defaults to `application/octet-stream`.
	ContentType pulumi.StringPtrOutput `pulumi:"contentType"`
	// A mapping of metadata to assign to this file.
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// An absolute path to a file on the local system.
	Source pulumi.StringPtrOutput `pulumi:"source"`
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageShareId pulumi.StringOutput `pulumi:"storageShareId"`
}

// NewShareFile registers a new resource with the given unique name, arguments, and options.
func NewShareFile(ctx *pulumi.Context,
	name string, args *ShareFileArgs, opts ...pulumi.ResourceOption) (*ShareFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StorageShareId == nil {
		return nil, errors.New("invalid value for required argument 'StorageShareId'")
	}
	var resource ShareFile
	err := ctx.RegisterResource("azure:storage/shareFile:ShareFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetShareFile gets an existing ShareFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetShareFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ShareFileState, opts ...pulumi.ResourceOption) (*ShareFile, error) {
	var resource ShareFile
	err := ctx.ReadResource("azure:storage/shareFile:ShareFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ShareFile resources.
type shareFileState struct {
	// Sets the file’s Content-Disposition header.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies which content encodings have been applied to the file.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The MD5 sum of the file contents. Changing this forces a new resource to be created.
	ContentMd5 *string `pulumi:"contentMd5"`
	// The content type of the share file. Defaults to `application/octet-stream`.
	ContentType *string `pulumi:"contentType"`
	// A mapping of metadata to assign to this file.
	Metadata map[string]string `pulumi:"metadata"`
	// The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
	Path *string `pulumi:"path"`
	// An absolute path to a file on the local system.
	Source *string `pulumi:"source"`
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageShareId *string `pulumi:"storageShareId"`
}

type ShareFileState struct {
	// Sets the file’s Content-Disposition header.
	ContentDisposition pulumi.StringPtrInput
	// Specifies which content encodings have been applied to the file.
	ContentEncoding pulumi.StringPtrInput
	// The MD5 sum of the file contents. Changing this forces a new resource to be created.
	ContentMd5 pulumi.StringPtrInput
	// The content type of the share file. Defaults to `application/octet-stream`.
	ContentType pulumi.StringPtrInput
	// A mapping of metadata to assign to this file.
	Metadata pulumi.StringMapInput
	// The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
	Path pulumi.StringPtrInput
	// An absolute path to a file on the local system.
	Source pulumi.StringPtrInput
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageShareId pulumi.StringPtrInput
}

func (ShareFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*shareFileState)(nil)).Elem()
}

type shareFileArgs struct {
	// Sets the file’s Content-Disposition header.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies which content encodings have been applied to the file.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The MD5 sum of the file contents. Changing this forces a new resource to be created.
	ContentMd5 *string `pulumi:"contentMd5"`
	// The content type of the share file. Defaults to `application/octet-stream`.
	ContentType *string `pulumi:"contentType"`
	// A mapping of metadata to assign to this file.
	Metadata map[string]string `pulumi:"metadata"`
	// The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
	Path *string `pulumi:"path"`
	// An absolute path to a file on the local system.
	Source *string `pulumi:"source"`
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageShareId string `pulumi:"storageShareId"`
}

// The set of arguments for constructing a ShareFile resource.
type ShareFileArgs struct {
	// Sets the file’s Content-Disposition header.
	ContentDisposition pulumi.StringPtrInput
	// Specifies which content encodings have been applied to the file.
	ContentEncoding pulumi.StringPtrInput
	// The MD5 sum of the file contents. Changing this forces a new resource to be created.
	ContentMd5 pulumi.StringPtrInput
	// The content type of the share file. Defaults to `application/octet-stream`.
	ContentType pulumi.StringPtrInput
	// A mapping of metadata to assign to this file.
	Metadata pulumi.StringMapInput
	// The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
	Path pulumi.StringPtrInput
	// An absolute path to a file on the local system.
	Source pulumi.StringPtrInput
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageShareId pulumi.StringInput
}

func (ShareFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*shareFileArgs)(nil)).Elem()
}

type ShareFileInput interface {
	pulumi.Input

	ToShareFileOutput() ShareFileOutput
	ToShareFileOutputWithContext(ctx context.Context) ShareFileOutput
}

func (*ShareFile) ElementType() reflect.Type {
	return reflect.TypeOf((*ShareFile)(nil))
}

func (i *ShareFile) ToShareFileOutput() ShareFileOutput {
	return i.ToShareFileOutputWithContext(context.Background())
}

func (i *ShareFile) ToShareFileOutputWithContext(ctx context.Context) ShareFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareFileOutput)
}

func (i *ShareFile) ToShareFilePtrOutput() ShareFilePtrOutput {
	return i.ToShareFilePtrOutputWithContext(context.Background())
}

func (i *ShareFile) ToShareFilePtrOutputWithContext(ctx context.Context) ShareFilePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareFilePtrOutput)
}

type ShareFilePtrInput interface {
	pulumi.Input

	ToShareFilePtrOutput() ShareFilePtrOutput
	ToShareFilePtrOutputWithContext(ctx context.Context) ShareFilePtrOutput
}

type shareFilePtrType ShareFileArgs

func (*shareFilePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ShareFile)(nil))
}

func (i *shareFilePtrType) ToShareFilePtrOutput() ShareFilePtrOutput {
	return i.ToShareFilePtrOutputWithContext(context.Background())
}

func (i *shareFilePtrType) ToShareFilePtrOutputWithContext(ctx context.Context) ShareFilePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareFilePtrOutput)
}

// ShareFileArrayInput is an input type that accepts ShareFileArray and ShareFileArrayOutput values.
// You can construct a concrete instance of `ShareFileArrayInput` via:
//
//          ShareFileArray{ ShareFileArgs{...} }
type ShareFileArrayInput interface {
	pulumi.Input

	ToShareFileArrayOutput() ShareFileArrayOutput
	ToShareFileArrayOutputWithContext(context.Context) ShareFileArrayOutput
}

type ShareFileArray []ShareFileInput

func (ShareFileArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ShareFile)(nil))
}

func (i ShareFileArray) ToShareFileArrayOutput() ShareFileArrayOutput {
	return i.ToShareFileArrayOutputWithContext(context.Background())
}

func (i ShareFileArray) ToShareFileArrayOutputWithContext(ctx context.Context) ShareFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareFileArrayOutput)
}

// ShareFileMapInput is an input type that accepts ShareFileMap and ShareFileMapOutput values.
// You can construct a concrete instance of `ShareFileMapInput` via:
//
//          ShareFileMap{ "key": ShareFileArgs{...} }
type ShareFileMapInput interface {
	pulumi.Input

	ToShareFileMapOutput() ShareFileMapOutput
	ToShareFileMapOutputWithContext(context.Context) ShareFileMapOutput
}

type ShareFileMap map[string]ShareFileInput

func (ShareFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ShareFile)(nil))
}

func (i ShareFileMap) ToShareFileMapOutput() ShareFileMapOutput {
	return i.ToShareFileMapOutputWithContext(context.Background())
}

func (i ShareFileMap) ToShareFileMapOutputWithContext(ctx context.Context) ShareFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareFileMapOutput)
}

type ShareFileOutput struct {
	*pulumi.OutputState
}

func (ShareFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ShareFile)(nil))
}

func (o ShareFileOutput) ToShareFileOutput() ShareFileOutput {
	return o
}

func (o ShareFileOutput) ToShareFileOutputWithContext(ctx context.Context) ShareFileOutput {
	return o
}

func (o ShareFileOutput) ToShareFilePtrOutput() ShareFilePtrOutput {
	return o.ToShareFilePtrOutputWithContext(context.Background())
}

func (o ShareFileOutput) ToShareFilePtrOutputWithContext(ctx context.Context) ShareFilePtrOutput {
	return o.ApplyT(func(v ShareFile) *ShareFile {
		return &v
	}).(ShareFilePtrOutput)
}

type ShareFilePtrOutput struct {
	*pulumi.OutputState
}

func (ShareFilePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ShareFile)(nil))
}

func (o ShareFilePtrOutput) ToShareFilePtrOutput() ShareFilePtrOutput {
	return o
}

func (o ShareFilePtrOutput) ToShareFilePtrOutputWithContext(ctx context.Context) ShareFilePtrOutput {
	return o
}

type ShareFileArrayOutput struct{ *pulumi.OutputState }

func (ShareFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ShareFile)(nil))
}

func (o ShareFileArrayOutput) ToShareFileArrayOutput() ShareFileArrayOutput {
	return o
}

func (o ShareFileArrayOutput) ToShareFileArrayOutputWithContext(ctx context.Context) ShareFileArrayOutput {
	return o
}

func (o ShareFileArrayOutput) Index(i pulumi.IntInput) ShareFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ShareFile {
		return vs[0].([]ShareFile)[vs[1].(int)]
	}).(ShareFileOutput)
}

type ShareFileMapOutput struct{ *pulumi.OutputState }

func (ShareFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ShareFile)(nil))
}

func (o ShareFileMapOutput) ToShareFileMapOutput() ShareFileMapOutput {
	return o
}

func (o ShareFileMapOutput) ToShareFileMapOutputWithContext(ctx context.Context) ShareFileMapOutput {
	return o
}

func (o ShareFileMapOutput) MapIndex(k pulumi.StringInput) ShareFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ShareFile {
		return vs[0].(map[string]ShareFile)[vs[1].(string)]
	}).(ShareFileOutput)
}

func init() {
	pulumi.RegisterOutputType(ShareFileOutput{})
	pulumi.RegisterOutputType(ShareFilePtrOutput{})
	pulumi.RegisterOutputType(ShareFileArrayOutput{})
	pulumi.RegisterOutputType(ShareFileMapOutput{})
}