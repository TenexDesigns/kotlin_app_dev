After asking for user permission to use cammera .Then to take picture can involve the followuing steps.

        on.setOnClickListener {
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)  // theis calls for the camera to capture the images
            startActivityForResult(i,101)



        }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            var pic:Bitmap? = data?.getParcelableArrayExtra("data")     //This gets the image captured and displayes iit.
            imageview.setImageBtmap(pic)
        }

        
        // Do more research on this topic

