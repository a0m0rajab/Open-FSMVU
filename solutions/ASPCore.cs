 // POST api/values
[HttpPost]
public ActionResult Post(int userID)
{
            var dep = _context.deparment
                          .Where(d => d.userID == userID)
                          .FirstOrDefault();
            var depID= dep.departmentID;
            
            HttpContext.Session.SetString("depID",depID + ""); // integer to string.
            return Ok();
}
[HttpPost]
public IActionResult EmployeeList() {
           int depID= HttpContext.Session.GetString("depID");
             var personels = from d in _context.deparment
                   where d.departmentID == depID
                   select d.userID;
           var personels2 =  _context.deparment.Where(d => d.departmentID == depID).ToList();
           return personels;
        }