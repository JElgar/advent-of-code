use std::fs;

fn main() {
    let file_path = "data.txt";
    let file_data = fs::read_to_string(file_path).expect("Could not read file");

    let mut rows = file_data.split("\n").fold(vec![0], |groups, row| {
        let mut groups = groups.clone();
        match row {
            "" => {
                groups.push(0)
            },
            val => *groups.last_mut().unwrap() +=  val.parse::<u32>().unwrap(),
        }
        groups
    });

    rows.sort();
    rows.reverse();
    println!("{:?}", rows[..3].iter().sum::<u32>());
}
