

public class GrivenceController{

    @RequestMapping(value="/grevience", method=RequestMethod.GET)

    public ResponseEntity<byte[]> getPDF1() {


    HttpHeaders headers = new HttpHeaders();

    //headers.setContentType(MediaType.parseMediaType("application/pdf"));

    String filename = "pdf1.pdf";

    headers.add("content-disposition", "inline;filename=" + filename);

    headers.setContentDispositionFormData(filename, filename);
    headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
    ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(pdf1Bytes, headers, HttpStatus.OK);
    return response;
}
   
}