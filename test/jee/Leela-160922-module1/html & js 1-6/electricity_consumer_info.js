function calculate_bill()
{
    var id = document.getElementById('num').value;
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var units = document.getElementById('units').value;
    var totalcharges;
    if (id.length == 8) 
    {
        var reg1=/^[1-9][0-9].{1,8}$/;
        if (name.length >= 3) 
        {
            var reg2 = /^[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-zA-Z]+$/;
            if (email.match(reg2)) 
            {
                if (units.length>0) 
                {
                    if (units <= 100) 
                    {
                        totalcharges=units*2.96;
                    } 
                    else 
                    {
                        totalcharges=units * 5.56;
                    }
                    alert("consumer '"  +name + "' with coneumer No '" +id+ "' and email '"+email+ "' used '" +units+ "' of electricity and charged '" +totalcharges+"'");
                    return true;
                }
                else 
                {
                    alert('enter number of units')
                }
            } 
            else 
            {
                alert('enter valid email id')
            }
        } 
        else 
        {
            alert('name should have minimum 3 characters')
        }
    } 
    else 
    {
        alert('consumer no should be 8 digits')
    }
    
    return false;
}