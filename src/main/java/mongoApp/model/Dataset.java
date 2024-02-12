package mongoApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Dataset")
public class Dataset {

    @Id
    private String _id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    private String property_type;
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private String last_scraped;
    private String calendar_last_scraped;
    private String first_review;
    private String last_review;
    private int accommodates;
    private int bedrooms;
    private int beds;

    public Dataset(String _id, String listing_url, String name, String summary, String space, String description, String neighborhood_overview, String notes, String transit, String access, String interaction, String house_rules, String property_type, String room_type, String bed_type, String minimum_nights, String maximum_nights, String cancellation_policy, String last_scraped, String calendar_last_scraped, String first_review, String last_review, int accommodates, int bedrooms, int beds) {
        this._id = _id;
        this.listing_url = listing_url;
        this.name = name;
        this.summary = summary;
        this.space = space;
        this.description = description;
        this.neighborhood_overview = neighborhood_overview;
        this.notes = notes;
        this.transit = transit;
        this.access = access;
        this.interaction = interaction;
        this.house_rules = house_rules;
        this.property_type = property_type;
        this.room_type = room_type;
        this.bed_type = bed_type;
        this.minimum_nights = minimum_nights;
        this.maximum_nights = maximum_nights;
        this.cancellation_policy = cancellation_policy;
        this.last_scraped = last_scraped;
        this.calendar_last_scraped = calendar_last_scraped;
        this.first_review = first_review;
        this.last_review = last_review;
        this.accommodates = accommodates;
        this.bedrooms = bedrooms;
        this.beds = beds;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNeighborhood_overview(String neighborhood_overview) {
        this.neighborhood_overview = neighborhood_overview;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public void setHouse_rules(String house_rules) {
        this.house_rules = house_rules;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public void setMinimum_nights(String minimum_nights) {
        this.minimum_nights = minimum_nights;
    }

    public void setMaximum_nights(String maximum_nights) {
        this.maximum_nights = maximum_nights;
    }

    public void setCancellation_policy(String cancellation_policy) {
        this.cancellation_policy = cancellation_policy;
    }

    public void setLast_scraped(String last_scraped) {
        this.last_scraped = last_scraped;
    }

    public void setCalendar_last_scraped(String calendar_last_scraped) {
        this.calendar_last_scraped = calendar_last_scraped;
    }

    public void setFirst_review(String first_review) {
        this.first_review = first_review;
    }

    public void setLast_review(String last_review) {
        this.last_review = last_review;
    }

    public void setAccommodates(int accommodates) {
        this.accommodates = accommodates;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public String get_id() {
        return _id;
    }

    public String getListing_url() {
        return listing_url;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public String getSpace() {
        return space;
    }

    public String getDescription() {
        return description;
    }

    public String getNeighborhood_overview() {
        return neighborhood_overview;
    }

    public String getNotes() {
        return notes;
    }

    public String getTransit() {
        return transit;
    }

    public String getAccess() {
        return access;
    }

    public String getInteraction() {
        return interaction;
    }

    public String getHouse_rules() {
        return house_rules;
    }

    public String getProperty_type() {
        return property_type;
    }

    public String getRoom_type() {
        return room_type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public String getMinimum_nights() {
        return minimum_nights;
    }

    public String getMaximum_nights() {
        return maximum_nights;
    }

    public String getCancellation_policy() {
        return cancellation_policy;
    }

    public String getLast_scraped() {
        return last_scraped;
    }

    public String getCalendar_last_scraped() {
        return calendar_last_scraped;
    }

    public String getFirst_review() {
        return first_review;
    }

    public String getLast_review() {
        return last_review;
    }

    public int getAccommodates() {
        return accommodates;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBeds() {
        return beds;
    }
}
